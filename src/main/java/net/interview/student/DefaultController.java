package net.interview.student;

import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String helloWorldEndpoint() {
        System.out.println("enter helloWorldEndpoint");
        System.out.println("added feature123");
        return "Hello from Students GET / endpoint !!";
    }
}
