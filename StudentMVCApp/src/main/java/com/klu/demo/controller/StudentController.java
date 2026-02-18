package com.klu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.demo.model.Student;
import com.klu.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/greet")
    public String getWelcomeMessage() {
        return service.getWelcomeMessage();
    }

    @PostMapping("/students/add")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return service.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    @GetMapping("/students/search")
    public List<Student> searchStudent(@RequestParam String name,
                                       @RequestParam String course) {
        return service.searchStudent(name, course);
    }
}
