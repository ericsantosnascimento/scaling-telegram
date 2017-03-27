package moip.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Coupon extends DomainEntity {

    private String key;
    private BigDecimal discount;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}