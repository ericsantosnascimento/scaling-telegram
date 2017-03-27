package moip.client.factory;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import moip.client.MoipApiClient;

/**
 * Created by eric on 28/11/16.
 */
public class MoipApiClientFactory {

    /**
     * build MoipApiClient instance
     *
     * @param endpoint the enpoint to connect to the server
     *                 with timeout be reached
     * @return MoipApiClient instance
     */
    public static MoipApiClient factory(String endpoint) {

        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .client(new OkHttpClient())
                .target(MoipApiClient.class, endpoint);
    }

}