package zw.co.amakureya.msuas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.amakureya.msuas.domain.Student;
import zw.co.amakureya.msuas.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student/")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("all")
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping
    public Student getStudent(@RequestParam int id) {
        return studentService.getAllStudents().get(id);

    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);

    }

    @DeleteMapping
    public void deleteStudent(@RequestParam Long id) {
        studentService.getStudentById(id);
    }

}
