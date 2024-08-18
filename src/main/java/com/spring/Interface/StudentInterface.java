package com.spring.Interface;

import com.spring.entities.Student;

public interface StudentInterface {
    public int insert(Student student);
    public int update(Student student);
    public int delete(Student student);
    public Student getStudent(int student_ID);
}
