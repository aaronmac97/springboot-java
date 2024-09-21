package zw.co.amakureya.msuas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.amakureya.msuas.domain.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
