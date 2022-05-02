package faheem.microservices.limitservice.controller;


import faheem.microservices.limitservice.entity.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrieveLimits(){

        return new Limits(1,5);
    }
}
