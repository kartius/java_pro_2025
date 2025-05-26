package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
    UserDao bean = applicationContext.getBean(UserDao.class);
//    for (int i = 0; i < 10; i++) {
//      User user = new User();
//      user.setName("Bob"+i);
//      user.setEmail("bob@gmail.com"+i);
//      bean.add(user);
//    }
    User byId = bean.getById(2);
    System.out.println(byId);


    System.out.println(bean.getAll());

  }

}
