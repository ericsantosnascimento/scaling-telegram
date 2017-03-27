package moip.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moip.domain.Order;
import moip.domain.Payment;
import moip.repository.PaymentRepository;

@Service
public class PaymentService {

    private PaymentRepository repository;

    private OrderService orderService;

    @Autowired
    public PaymentService(PaymentRepository repository, OrderService orderService) {
        this.repository = repository;
        this.orderService = orderService;
    }

    Payment create(String orderId, Payment payment) {

        Order order = orderService.findOne(orderId);
        payment.setOrder(order);
        order.setPayment(payment);
        return repository.save(payment);

    }

}
