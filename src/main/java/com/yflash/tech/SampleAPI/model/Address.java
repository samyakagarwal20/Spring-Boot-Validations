package com.yflash.tech.SampleAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    @NotBlank
    @Size(min = 5, max = 15)
    private String street;

    @NotBlank
    @Size(min = 3, max = 5)
    private String city;

    @Pattern(regexp = "\\d{6}")
    private String zipcode;

}
