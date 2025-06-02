package org.example.spring_boot.config;

import org.example.spring_boot.sevice.OtherService;
import org.example.spring_boot.sevice.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

  @Value("${app.my.value}")
  private String appName;

  @Bean
  public StudentService studentService() {
    return new StudentService();
  }

  @Bean
  public OtherService otherService(StudentService studentService) {
    return new OtherService(studentService);
  }

  public String getAppName() {
    return appName;
  }
}
