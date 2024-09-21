package zw.co.amakureya.msuas.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Department {
    @Id
    @SequenceGenerator(name = "department_seq",sequenceName = "department_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_seq")
    private String id;
    private String name;
    private String location;
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;


}
