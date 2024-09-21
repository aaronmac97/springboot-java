package zw.co.amakureya.msuas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import zw.co.amakureya.msuas.domain.Student;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Long> {

}
