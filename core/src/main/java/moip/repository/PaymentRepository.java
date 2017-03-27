package moip.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import moip.domain.Payment;

/**
 * Created by eric-nasc on 26/03/17.
 */
@Repository
public interface PaymentRepository extends CrudRepository<Payment, String> {

}
