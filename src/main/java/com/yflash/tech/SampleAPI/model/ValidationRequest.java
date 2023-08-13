package com.yflash.tech.SampleAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidationRequest implements Serializable {

    @NotNull
    private String name;

    @NotEmpty
    private String email;

    @NotBlank
    private String description;

    @Size(min = 10, max = 200)
    private String bio;

    @Min(18)
    private int age;

    @Max(100)
    private int score;

    @DecimalMin("0.01")
    private BigDecimal price;

    @DecimalMax("1000.00")
    private BigDecimal budget;

    @Digits(integer = 3, fraction = 2)
    private BigDecimal amount;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{4}")
    private String ssn;

    @Email
    private String emailAddress;

    @Future
    private Date eventDate;

    @Past
    private Date birthDate;

    @AssertTrue
    private boolean agreedToTerms;

    @AssertFalse
    private boolean isDeleted;

    @Valid
    private Address address;

    @URL
    private String websiteUrl;

    @Range(min = 1, max = 5)
    private int rating;

    @NotEmpty
    private Set<String> tags;

    @Size(min = 1, max = 3)
    private String[] priorities;

    @Min(value = 1, message = "Quantity must be at least 1")
    @Max(value = 10, message = "Quantity cannot exceed 10")
    private int itemQuantity;

}
