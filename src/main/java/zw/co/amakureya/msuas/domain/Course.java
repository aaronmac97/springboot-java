package zw.co.amakureya.msuas.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @SequenceGenerator(name = "course_seq",sequenceName = "course_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    private String id;
    private String courseName;
    private int courseDuration;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

}
