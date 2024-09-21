package zw.co.amakureya.msuas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Instructor {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    private String phone;

}
