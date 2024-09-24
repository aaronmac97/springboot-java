package zw.co.amakureya.msuas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.amakureya.msuas.domain.Course;
import zw.co.amakureya.msuas.services.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("all")
    public List<Course> getAll() {
        return courseService.getCourses();
    }

    @GetMapping
    public Course getCourseById(int id) {
        return courseService.getCourse(id);
    }

    @PostMapping("addCourse")
    public Course addCourse(Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping
    public Course updateCourse(Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping
    public Course deleteCourse(int id) {
        return courseService.deleteCourse(id);
    }

}
