package faheem.microservices.limitservice.controller;


import faheem.microservices.limitservice.configuration.LimitsConfiguration;
import faheem.microservices.limitservice.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    LimitsConfiguration limitsConfiguration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){

        return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
    }
}
