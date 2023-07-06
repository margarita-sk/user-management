package com.smartclinic.usermanagement.applicationservice;

import com.smartclinic.usermanagement.repository.UserRepository;


public class UserService {

    private UserRepository repository;


    public void get(){
        repository.findAll();

    }
}
