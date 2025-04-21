package org.lessons.lesson_30.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.lessons.lesson_30.dto.Group;
import org.lessons.lesson_30.dto.Student;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    Session session = sessionFactory.openSession();

    try {
      Group group = new Group("JAVA_PRO");
      Student student =
              new Student("John", "dsfdfs", "student", group);

      session.beginTransaction();

      session.persist(group);

      session.persist(student);

      session.getTransaction().commit();

      List<Student> students =
              session.createQuery("from Student", Student.class).getResultList();

      for (Student s : students) {
        System.out.println(s);
      }

      List<Group> groups = session.createQuery("from Group ", Group.class).getResultList();

      for (Group g : groups) {
        System.out.println(g);
      }

    } finally {
      sessionFactory.close();
    }


  }
}
