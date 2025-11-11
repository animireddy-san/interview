package net.interview.student;

import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String helloWorldEndpoint() {

        return "Hello from Students GET / endpoint !!";
    }
}
