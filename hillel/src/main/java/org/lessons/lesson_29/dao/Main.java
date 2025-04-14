package org.lessons.lesson_29.dao;

import org.lessons.lesson_29.dto.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/hillel";
    String username = "root";
    String password = "password";

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
      StudentDAO studentDAO = new StudentDAO(connection);

      studentDAO.add(new Student("Bob","43242", "Bob is new student", 1));

      System.out.println(studentDAO.getAll());

    }
  }
}
