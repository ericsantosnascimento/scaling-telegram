package moip.configuration;

import moip.client.MoipApiClient;
import moip.client.factory.MoipApiClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyApiClientConfiguration {

    @Value("${api.endpoint}")
    private String moipApiClient;

    @Bean
    public MoipApiClient currencyApiClient() {
        return MoipApiClientFactory.factory(moipApiClient);
    }

}