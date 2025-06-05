package org.example.spring_data.repository;

import org.example.spring_data.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

  @Query(value = "select * from users AS s", nativeQuery = true)
  List<User> getUsers();

  User getUById(int id);

//  User getUserByIdAndCourseAndNameOrderById();

}
