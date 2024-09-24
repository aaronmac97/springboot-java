package zw.co.amakureya.msuas.services;


import zw.co.amakureya.msuas.domain.Instructor;

import java.util.List;

public interface InstructorService {
    List<Instructor> getInstructors();
    Instructor getInstructor(int id);
    Instructor saveInstructor(Instructor instructor);
    Instructor deleteInstructor(int id);
    Instructor updateInstructor(Instructor instructor);

}
