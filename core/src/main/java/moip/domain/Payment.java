package moip.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
public class Payment extends DomainEntity {

    static final BigDecimal TAX = BigDecimal.valueOf(0.025);

    private Integer installmentQuantity;

    @OneToOne(cascade = CascadeType.ALL)
    private CreditCard card;

    @JsonIgnore
    @OneToOne(mappedBy = "payment")
    private Order order;

    Payment(Integer installmentQuantity) {
        this.installmentQuantity = installmentQuantity;
    }

    public Boolean hasAdditionalTax() {
        return this.installmentQuantity > 1;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
}
