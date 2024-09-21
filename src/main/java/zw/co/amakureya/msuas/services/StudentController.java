package zw.co.amakureya.msuas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.amakureya.msuas.domain.Student;
import zw.co.amakureya.msuas.repository.StudentRepo;

@Service

public class StudentController {
    @Autowired
    private StudentRepo studentRepo;
    public void saveUser(Student student) {
        student.setFirstName("John");
        student.setLastName("Smith");
        student.setAge(30);
        studentRepo.save(student);
        System.out.println(student);
    }


}
