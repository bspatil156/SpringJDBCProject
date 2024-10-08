package com.spring.Interface;

import com.spring.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> {


//    mapRow is a method inside RowMapper interface.
//    You need to implement it here.
//    Just create an object of 'Student' class.
//    Now set the values of each column by retrieving them form the resultset 'rs'.
//    Then return the student object.
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        student.setHobby(rs.getString(4));
        return student;
    }
}
