package org.example.spring_data.repository;

import org.example.spring_data.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
