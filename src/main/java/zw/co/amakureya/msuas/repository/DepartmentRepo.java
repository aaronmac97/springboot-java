package zw.co.amakureya.msuas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.amakureya.msuas.domain.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
