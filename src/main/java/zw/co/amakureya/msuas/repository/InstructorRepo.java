package zw.co.amakureya.msuas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.amakureya.msuas.domain.Instructor;

public interface InstructorRepo extends JpaRepository<Instructor, Integer> {
}
