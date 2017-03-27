package moip.domain;

import moip.domain.enums.OrderStatus;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Order extends DomainEntity {

    private OrderStatus status = OrderStatus.CREATED;

    private String externalId;

    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> items;

    @OneToOne
    private Coupon coupon;

    @OneToOne
    private Payment payment;

    BigDecimal getDiscount() {

        if(this.coupon != null) {
            return coupon.getDiscount().multiply(getTotal());
        }

        return BigDecimal.ZERO;
    }

    BigDecimal getTotal() {
        double sum = items.stream().mapToDouble(item -> item.getTotal().doubleValue()).sum();
        return BigDecimal.valueOf(sum);
    }

    public BigDecimal getTotalWithDiscount() {

        BigDecimal value = getTotal();
        value = applyCoupon(value);
        value = applyAdditionalTax(value);
        return value;

    }

    BigDecimal applyCoupon(BigDecimal value) {

        if(this.coupon != null) {
            return value.subtract(getDiscount());
        }

        return value;
    }

    BigDecimal applyAdditionalTax(BigDecimal value) {

        if(this.payment != null && this.payment.hasAdditionalTax()) {
            return value.add(Payment.TAX.multiply(value));
        }

        return value;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<Item> getItems() {
        return items;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
