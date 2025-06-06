package org.example.springmvc.controller;

import lombok.AllArgsConstructor;
import org.example.springmvc.model.User;
import org.example.springmvc.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/based/users")
@AllArgsConstructor
public class BasedUserController {

  private UserService userService;

  @PostMapping("/add")
  public void addUser(@RequestBody User user) {
    userService.addUser(user);
  }

  @GetMapping(value = "/getAll", produces = MediaType.TEXT_PLAIN_VALUE)
  public @ResponseBody Map<Integer, User> getAll() {
    return userService.getAllUsers();
  }

  @GetMapping(value = "/getUser", produces = MediaType.TEXT_PLAIN_VALUE)
  public @ResponseBody User getUser() {
    return new User(1, "Bob", "email");
  }
}
