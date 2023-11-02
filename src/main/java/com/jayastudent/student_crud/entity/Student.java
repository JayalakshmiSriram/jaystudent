package com.jayastudent.student_crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student_spring_records")
public class Student {
    @Id

    private int roll;
    @Column
    private String name;
    @Column
    private String city;

    public Student(){

    }
    public Student(int roll, String name, String city){
        super();
        this.roll = roll;
        this.name = name;
        this.city = city;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
