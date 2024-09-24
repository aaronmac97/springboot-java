package zw.co.amakureya.msuas.services;

import org.springframework.stereotype.Service;
import zw.co.amakureya.msuas.domain.Department;

import java.util.List;


public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(int id);
    Department saveDepartment(Department department);
    Department updateDepartment(Department department);
    Department deleteDepartment(int id);

}
