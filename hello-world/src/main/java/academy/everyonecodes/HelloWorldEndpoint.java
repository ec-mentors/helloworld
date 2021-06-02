package academy.everyonecodes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldEndpoint {

    @GetMapping
    String getMessage(){
        return "Hello World!";
    }
}
