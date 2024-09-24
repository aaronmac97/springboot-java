package zw.co.amakureya.msuas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.amakureya.msuas.domain.Course;
import zw.co.amakureya.msuas.repository.CourseRepo;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;
    @Override
    public List<Course> getCourses() {
        return List.of();
    }

    @Override
    public Course getCourse(int id) {
        return courseRepo.getOne(id);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course deleteCourse(int id) {
        courseRepo.deleteById(id);
        return courseRepo.getOne(id);

    }
}
