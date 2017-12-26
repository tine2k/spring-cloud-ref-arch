package com.example.ms2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);


    @GetMapping("/greet/{who}")
    @ResponseBody
    public String hello(@PathVariable("who") String who) {
        logger.info("Hello {}!", who);
        return "Hello " + who + " Instance: " + this;
    }

}
