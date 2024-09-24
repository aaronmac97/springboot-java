package zw.co.amakureya.msuas.services;

import org.springframework.stereotype.Service;
import zw.co.amakureya.msuas.domain.Course;

import java.util.List;


public interface CourseService {
    List<Course> getCourses();
    Course getCourse(int id);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course deleteCourse(int id);

}
