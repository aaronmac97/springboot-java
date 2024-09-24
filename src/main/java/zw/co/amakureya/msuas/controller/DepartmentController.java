package zw.co.amakureya.msuas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.amakureya.msuas.domain.Department;
import zw.co.amakureya.msuas.services.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("all")
    private List<Department> getAll() {
        return departmentService.getAllDepartments();
    }
    @GetMapping
    private List<Department> getById(int id) {
        return (List<Department>) departmentService.getDepartmentById(id);
    }
    @PostMapping("addDepartment")
    private Department addDepartment(Department department) {
        return departmentService.saveDepartment(department);

    }

    @PutMapping
    private Department updateDepartment(Department department) {
        return departmentService.updateDepartment(department);
    }
    @DeleteMapping
    private Department deleteDepartment(int id) {
        return departmentService.deleteDepartment(id);
    }
}
