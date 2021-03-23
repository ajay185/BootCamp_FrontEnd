package com.example.backend.controller;

import com.example.backend.model.Student;
import com.example.backend.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @CrossOrigin
    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student user) {
        StudentRepository s = new StudentRepository();
        s.saveStudent(user);
        return ResponseEntity.ok("SUCCESS");
    }

    @CrossOrigin
    @GetMapping("/getStudent")
    public ResponseEntity<List<Student>> getAllStudent() {
        StudentRepository s = new StudentRepository();
        return ResponseEntity.ok(s.getAllStudent());
    }
}
