package com.smartclinic.usermanagement.domain;

public enum PhoneCountryCode {
    ABKHAZIA("+7 840");

    private final String code;

    PhoneCountryCode(String code) {
        this.code = code;
    }
}
