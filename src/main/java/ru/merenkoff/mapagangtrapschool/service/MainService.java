package ru.merenkoff.mapagangtrapschool.service;

import ru.merenkoff.mapagangtrapschool.domain.Course;

public interface MainService {
    void createOrUpdateCourse(Course course);

    Course getCourseById(Long id);

    void deleteCourse(Long id);
}
