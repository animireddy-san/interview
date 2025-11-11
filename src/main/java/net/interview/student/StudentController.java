package net.interview.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * The StudentsRepository is ALREADY CREATED AND POPULATED.
 *
 * The Spring Boot application is READY and CONFIGURED. We just need to
 * Implement a rest controller to operate on the students repository
 *
 * Create a REST ENDPOINT to retrieve all students from repository via GET /v1/students
 *
 * idem to retrieve one single student via GET /v1/students/{id}
 *
 * delete a student via DELETE /v1/students/{id}
 *
 * update or create student are via POST or PUT ? why?
 */

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @GetMapping("/allstudents")
    public ResponseEntity<List<Student>> getAllStudents()
    {

        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }


}
