package moip.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
public class Item extends DomainEntity {

    private Integer quantity;

    @OneToOne
    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getTotal() {
        return this.product.getPrice().multiply(BigDecimal.valueOf(quantity));
    }
}