package com.yflash.tech.SampleAPI.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger LOGGER = LogManager.getLogger(DemoController.class);

    @GetMapping(value = "/check-request", produces = "application/json")
    ResponseEntity<String> validationChecker() {
        return null;
    }

}
