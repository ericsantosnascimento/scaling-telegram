package moip.client;

import feign.FeignException;
import feign.Headers;
import feign.RequestLine;
import moip.domain.Order;
import moip.response.MoipResponse;

/**
 * Merchant client Api, responsible to provide methods to create, update or retrive Store or Groups
 * <p>
 * Created by eric-nascimento on 28/11/16.
 */
@Headers("Content-Type: application/json")
public interface MoipApiClient {

    @RequestLine("GET /v2/orders")
    MoipResponse getOrder(Order order) throws FeignException;

}