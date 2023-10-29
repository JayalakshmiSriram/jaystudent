package com.jayastudent.student_crud.controller;

import com.jayastudent.student_crud.entity.Student;
import com.jayastudent.student_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return studentService.addStudent(student);
    }
    @PostMapping("/bulkadd")
    public String addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }
    @DeleteMapping("/all/{roll}")
    public String deleteStudent(@PathVariable int roll){
        return studentService.deleteStudent(roll);
    }
    @PutMapping("/add")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student) ;
    }
    @RequestMapping("/all/{roll}")
    public Student getStudent(@PathVariable int roll){
        return studentService.getStudent(roll);
    }
}
