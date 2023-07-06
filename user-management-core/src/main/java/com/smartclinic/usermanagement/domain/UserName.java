package com.smartclinic.usermanagement.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class UserName {
    private String firstName;
    private String lastName;
}
