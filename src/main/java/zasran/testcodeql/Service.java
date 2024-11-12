package zasran.testcodeql;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    // @Bean
    // private RestTemplate rt = new RestTemplate();

    public String getResource(String id) {
        return String.format("Resource from service [%s]", id);
    }
}
