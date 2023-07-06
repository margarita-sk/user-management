package com.smartclinic.usermanagement;

import com.smartclinic.usermanagement.config.ApplicationContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication (scanBasePackages = "com.smartclinic.usermanagement")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        final var context = ApplicationContextHolder.getApplicationContext();
//        final var environment = context.getEnvironment();
//        final var propertySources = ((ConfigurableEnvironment) environment).getPropertySources();
//        environment.getActiveProfiles();
//        propertySources.get("something");
//        final var bean = context.getBean("MyBean");
//        System.out.println(bean);
    }

}
