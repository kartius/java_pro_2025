package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

  @Bean
  public DataSource dataSource(){
    DriverManagerDataSource source = new DriverManagerDataSource();
    source.setUrl("jdbc:mysql://localhost:3306/hillel");
    source.setUsername("root");
    source.setPassword("password");
    source.setDriverClassName("com.mysql.cj.jdbc.Driver");
    return source;
  }

}
