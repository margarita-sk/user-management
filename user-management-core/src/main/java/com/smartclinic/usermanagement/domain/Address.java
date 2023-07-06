package com.smartclinic.usermanagement.domain;

import jakarta.persistence.Embeddable;
import org.springframework.context.annotation.Lazy;

@Embeddable
public class Address {
    private String country;
    private String cityArea;
    private String city;
    private String street;
    private String apartmentNumber;
    private String postalCode;
}
