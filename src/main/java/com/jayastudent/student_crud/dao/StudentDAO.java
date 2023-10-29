package com.jayastudent.student_crud.dao;

import com.jayastudent.student_crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Integer> {

}
