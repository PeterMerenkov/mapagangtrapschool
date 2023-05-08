package ru.merenkoff.mapagangtrapschool.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.merenkoff.mapagangtrapschool.domain.Course;
import ru.merenkoff.mapagangtrapschool.domain.Discipline;
import ru.merenkoff.mapagangtrapschool.domain.Exam;
import ru.merenkoff.mapagangtrapschool.domain.Question;
import ru.merenkoff.mapagangtrapschool.repo.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {
    private final CourseRepo courseRepo;
    private final DisciplineRepo disciplineRepo;
    private final ExamRepo examRepo;
    private final QuestionRepo questionRepo;
    private final AnswerRepo answerRepo;

    @Override
    public Course getCourseById(Long id) {
        return courseRepo.findById(id).orElseThrow();
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public void createOrUpdateCourse(Course course) {
        courseRepo.save(course);
    }
}
