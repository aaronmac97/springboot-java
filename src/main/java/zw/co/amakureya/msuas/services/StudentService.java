package zw.co.amakureya.msuas.services;

import zw.co.amakureya.msuas.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);

}
