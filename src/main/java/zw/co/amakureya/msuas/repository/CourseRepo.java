package zw.co.amakureya.msuas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.amakureya.msuas.domain.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
