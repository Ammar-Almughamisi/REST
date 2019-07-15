package com.rest.jackson.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("ammar", "almughamisi"));
        students.add(new Student("frozen", "sea"));
        students.add(new Student("Hexaed", "Region"));
        for (Student stu : students
        ) {
            System.out.println(stu.getFirstName());
        }
        return students;
    }
}
