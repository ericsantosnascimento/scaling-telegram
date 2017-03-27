package moip.service;

import moip.domain.Order;
import moip.exception.NotFoundException;
import moip.exception.PaymentException;
import moip.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by eric-nasc on 26/03/17.
 */
@Service
public class OrderService {

    private OrderRepository repository;
    private MoipService moipService;

    public OrderService(OrderRepository repository, MoipService moipService) {
        this.repository = repository;
        this.moipService = moipService;
    }

    public Order checkout(Order order) {

        order = repository.findOne(order.getExternalId());

        validate(order);

        order = moipService.create(order);

        return repository.save(order);
    }

    private void validate(Order order) {
        if (order.getPayment() == null) {
            throw new PaymentException("order needs payment to checkout");
        }
    }

    public Order findOne(String id) {

        if (!repository.exists(id)) {
            throw new NotFoundException("order not found");
        }

        return repository.findOne(id);
    }

    public Order update(Order order) {
        return repository.save(order);
    }


    public Order create(Order order) {
        return repository.save(order);
    }

    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }
}
