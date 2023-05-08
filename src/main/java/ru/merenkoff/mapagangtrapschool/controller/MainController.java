package ru.merenkoff.mapagangtrapschool.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.merenkoff.mapagangtrapschool.domain.Course;
import ru.merenkoff.mapagangtrapschool.service.MainService;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("getCourse")
    public Course getCourse(@RequestParam Long id) {
        return mainService.getCourseById(id);
    }

    @PostMapping("createOrUpdateCourse")
    public void createOrUpdateCourse(@RequestBody Course Course) {
        mainService.createOrUpdateCourse(Course);
    }

    @DeleteMapping("deleteCourse")
    public void deleteCourse(@RequestParam Long id) {
        mainService.deleteCourse(id);
    }
}
