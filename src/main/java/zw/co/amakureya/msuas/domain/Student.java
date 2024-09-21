package zw.co.amakureya.msuas.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import zw.co.amakureya.msuas.repository.StudentRepo;

import java.io.Serializable;

@Data
@Entity
@Getter
@Setter
public class Student {
    @Id
    @SequenceGenerator(name = "student_seq",sequenceName = "student_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_seq")
    private Long id;
    @Column(length = 50, nullable = false)
    private String firstName;
    @Column(length = 50, nullable = false)
    private String lastName;
    private int age;
}
