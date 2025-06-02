package org.example.spring_boot;

import org.example.spring_boot.config.ConfigApp;
import org.example.spring_boot.model.Student;
import org.example.spring_boot.sevice.OtherService;
import org.example.spring_boot.sevice.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

    StudentService studentService = applicationContext.getBean(StudentService.class);
    studentService.addStudent(new Student(1, "Bob"));

    OtherService otherService = applicationContext.getBean(OtherService.class);
    otherService.printAllStudents();

    ConfigApp configApp = applicationContext.getBean(ConfigApp.class);

    System.out.println(configApp.getAppName());
  }

}
