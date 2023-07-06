package com.smartclinic.usermanagement.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.smartclinic.usermanagement.repository")
public class Config {
    @Bean
    public DataSource dataSource() {
        final var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/db");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        return dataSource;
    }


}
