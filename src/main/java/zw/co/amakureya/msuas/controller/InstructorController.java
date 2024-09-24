package zw.co.amakureya.msuas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.amakureya.msuas.domain.Instructor;
import zw.co.amakureya.msuas.services.InstructorService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructor/")
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @GetMapping("all")
    private List<Instructor> getAll() {
        return instructorService.getInstructors();
    }

    @GetMapping
    private List<Instructor> getById(int id) {
        return (List<Instructor>) instructorService.getInstructor(id);

    }

    @PostMapping("addInstructor")
    private Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @PutMapping
    private Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping
    private Instructor deleteInstructor(@RequestBody int id) {
        return instructorService.deleteInstructor(id);
    }
}
