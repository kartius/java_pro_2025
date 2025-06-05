package org.example.spring_data;

import org.example.spring_data.dto.Course;
import org.example.spring_data.dto.User;
import org.example.spring_data.repository.CourseRepository;
import org.example.spring_data.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDataApplication.class, args);
    UserRepository userRepository = applicationContext.getBean(UserRepository.class);
    CourseRepository courseRepository = applicationContext.getBean(CourseRepository.class);

    Course course = new Course();
    course.setName("JAVA PRO");

    courseRepository.save(course);

    User user = new User();

    user.setCourse(course);
    user.setEmail("bob@gmail.com");
    user.setName("Bob");

    userRepository.save(user);
    List<User> all = userRepository.findAll();
    System.out.println(all);
    System.out.println(userRepository.getUsers());

    System.out.println("-----------" + userRepository.getUById(3));
  }
}
