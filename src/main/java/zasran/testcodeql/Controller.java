package zasran.testcodeql;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world from TestCodeQL";
    }

    @GetMapping("/resource/{id}")
    public String getResource(@PathVariable String id) {
        return new Service().getResource(id);
    }

}
