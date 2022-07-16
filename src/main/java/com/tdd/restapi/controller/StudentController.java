package com.tdd.restapi.controller;

import com.tdd.restapi.persistence.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student( "John", "McClane", 1123, "123 St, Nyc"));
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
