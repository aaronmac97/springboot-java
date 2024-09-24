package zw.co.amakureya.msuas.services;

import org.springframework.stereotype.Service;
import zw.co.amakureya.msuas.domain.Department;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Override
    public List<Department> getAllDepartments() {
        return List.of();
    }

    @Override
    public Department getDepartmentById(int id) {
        return null;
    }

    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }

    @Override
    public Department deleteDepartment(int id) {
        return null;
    }
}
