package com.example.studentapi;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.set(i, updatedStudent);

                return "Student Updated";
            }
        }

        return "Student Not Found";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);

                return "Student Deleted";
            }
        }

        return "Student Not Found";
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                return student;
            }
        }

        return null;
    }
}