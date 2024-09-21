package zw.co.amakureya.msuas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zw.co.amakureya.msuas.domain.Student;
import zw.co.amakureya.msuas.repository.StudentRepo;


@SpringBootApplication
public class MsuasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsuasApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
        return args -> {
            Student s1 = new Student();
            s1.setFirstName("John");
            s1.setLastName("Smith");
            Student s2 = new Student();
            s2.setFirstName("Jane");
            s2.setLastName("Doe");
            Student s3 = new Student();
            s3.setFirstName("Jack");
            s3.setLastName("Smith");
            studentRepo.save(s1);
            studentRepo.save(s2);
            studentRepo.save(s3);
        };

    }
}
