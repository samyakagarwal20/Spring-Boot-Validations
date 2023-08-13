package com.yflash.tech.SampleAPI.controller;

import com.yflash.tech.SampleAPI.model.ValidationRequest;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger LOGGER = LogManager.getLogger(DemoController.class);

    @PostMapping(value = "/check-validation", produces = "application/json")
    ResponseEntity<String> validationChecker(@Valid ValidationRequest validationRequest) {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

}
