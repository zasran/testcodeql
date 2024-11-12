package zasran.testcodeql;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    private RestTemplate rt = new RestTemplate();

    public String getResource(String id) {
        return rt.getForObject("http://echo.jsontest.com/resource/" + id, String.class);
    }
}
