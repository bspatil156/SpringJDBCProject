package com.spring.Interface;

import com.spring.entities.Student;

import java.util.List;

//This is an inteface which is implemented by 'StudentInterfaceImpl'.
//We declare the CRUD operations methods here.
public interface StudentInterface {
    public int insert(Student student);
    public int update(Student student);
    public int delete(Student student);
    public Student getStudent(int student_ID);
    public List<Student> getAllStudents();
}
