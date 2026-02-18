package com.klu.demo.service;

import java.util.List;
import com.klu.demo.model.Student;

public interface StudentService {

    String getWelcomeMessage();

    Student createStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    Student updateStudent(int id, Student student);

    String deleteStudent(int id);

    List<Student> searchStudent(String name, String course);
}
