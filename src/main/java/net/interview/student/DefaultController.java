package net.interview.student;

import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String helloWorldEndpoint() {
        System.out.println("main change");
        System.out.println("feate changes");
        return "Hello from Students GET / endpoint !!";
    }
}
