package com.yflash.tech.SampleAPI.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Address {

    @NotBlank
    @Max(value = 10)
    private String street;

    @NotBlank
    @Size(min = 3, max = 5)
    private String city;

    @Pattern(regexp = "\\d{6}")
    private String zipcode;

}
