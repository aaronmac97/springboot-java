package zw.co.amakureya.msuas.services;

import org.springframework.stereotype.Service;
import zw.co.amakureya.msuas.domain.Instructor;

import java.util.List;
@Service
public class InstructorServiceImpl implements InstructorService {

    @Override
    public List<Instructor> getInstructors() {
        return List.of();
    }

    @Override
    public Instructor getInstructor(int id) {
        return null;
    }

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return null;
    }

    @Override
    public Instructor deleteInstructor(int id) {
        return null;
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return null;
    }
}
