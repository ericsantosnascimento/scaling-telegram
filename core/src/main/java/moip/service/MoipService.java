package moip.service;

import moip.client.MoipApiClient;
import moip.domain.enums.OrderStatus;
import moip.response.MoipResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import moip.domain.Order;


@Service
public class MoipService {

    private static final Logger logger = LoggerFactory.getLogger(MoipService.class);

    private MoipApiClient moipApiClient;

    @Autowired
    public MoipService(MoipApiClient moipApiClient) {
        this.moipApiClient = moipApiClient;
    }

    public Order create(Order order) {

        MoipResponse response = moipApiClient.getOrder(order);

        if (response != null) {
            order.setStatus(OrderStatus.CREATED);
        } else {
            order.setStatus(OrderStatus.FAILED);
        }

        return order;

    }
}