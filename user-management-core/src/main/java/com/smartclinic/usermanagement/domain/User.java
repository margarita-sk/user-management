package com.smartclinic.usermanagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    private Long id;
    private Long tenantId;
    private String email;
    private UserName name;
    private Address address;
//    private PhoneNumber phoneNumber;
    private String defaultLanguage;
    private String defaultDateTimeFormat;

}
