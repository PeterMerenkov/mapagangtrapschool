package ru.merenkoff.mapagangtrapschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.merenkoff.mapagangtrapschool.domain.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
