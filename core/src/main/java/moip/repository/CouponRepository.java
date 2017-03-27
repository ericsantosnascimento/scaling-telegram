package moip.repository;

import org.springframework.data.repository.CrudRepository;
import moip.domain.Coupon;

import java.util.Optional;

/**
 * Created by eric-nasc on 26/03/17.
 */
public interface CouponRepository extends CrudRepository<Coupon, String> {

    Optional<Coupon> findByKey(String key);
}
