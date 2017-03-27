package moip.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Product extends DomainEntity {

    private String name;
    private String detail;
    private BigDecimal price = BigDecimal.ZERO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}