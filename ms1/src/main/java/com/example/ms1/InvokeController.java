package com.example.ms1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InvokeController {

    private static final Logger log = LoggerFactory.getLogger(InvokeController.class);

    private final Ms2Client client;

    public InvokeController(Ms2Client client) {
        this.client = client;
    }

    @GetMapping
    @ResponseBody
    public String invokeGreeting() {

        log.info("invoking service 2...");

        // call service 2
        String reply = client.hello("Service 1");

        return String.format("Received Msg: '%s'", reply);
    }

}
