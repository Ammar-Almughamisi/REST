package com.rest.jackson.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<Student>();
        students.add(new Student("ammar", "almughamisi"));
        students.add(new Student("frozen", "sea"));
        students.add(new Student("Hexaed", "Region"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundExc("Student id not found" + " " + studentId);
        }
        return students.get(studentId);
    }

}
