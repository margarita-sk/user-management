package com.smartclinic.usermanagement.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class PhoneNumber {
    private PhoneCountryCode countryCode;
    private int number;
}
