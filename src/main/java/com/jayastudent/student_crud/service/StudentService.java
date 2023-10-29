package com.jayastudent.student_crud.service;

import com.jayastudent.student_crud.dao.StudentDAO;
import com.jayastudent.student_crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
private StudentDAO dao;
    public String addStudent(Student student){
        dao.save(student);
        return "New Student has been added in to Database, roll number :"+ student.getRoll();
    }
    public String addStudents(List<Student> students){
        dao.saveAll(students);
        return "New Student has been added in to Database";
}
    public String deleteStudent(int roll){
        Student student = dao.getById(roll);
        dao.delete(student);
        return "Roll number is deleted :"+roll;
    }
    public String updateStudent(Student student){
        dao.save(student);
        return "Roll number is updated:"+ student.getRoll();
    }
    public Student getStudent(int roll){
        return dao.findById(roll).get();
    }
}