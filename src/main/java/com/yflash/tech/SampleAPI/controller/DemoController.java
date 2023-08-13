package com.yflash.tech.SampleAPI.controller;

import com.yflash.tech.SampleAPI.model.ValidationRequest;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DemoController {

    private static final Logger LOGGER = LogManager.getLogger(DemoController.class);

    @PostMapping(value = "/check-validation")
    public ResponseEntity<?> validationChecker(@RequestBody @Valid ValidationRequest validationRequest, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            //constructing response with validation errors
            List<String> errors = bindingResult.getFieldErrors().stream()
                    .map(error -> error.getField() + ": " + error.getDefaultMessage())
                    .collect(Collectors.toList());
            return ResponseEntity.badRequest().body(errors);
        }
        return new ResponseEntity<>("all validations passed successfully", HttpStatus.OK);
    }

}
