package com.spring.Interface;

import com.spring.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentInterfaceImpl implements StudentInterface {

    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "insert into student values(?,?,?,?)";
        int result = jdbcTemplate.update(query, student.getId(), student.getName(),student.getCity(),student.getHobby());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "update student set Name=?,City=?,Hobby=? where Id=?";
        int result = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getHobby(),student.getId());
        return result;
    }

    public int delete(Student student){
        String query = "delete from student where Id=?";
        int result = jdbcTemplate.update(query,student.getId());
        return result;
    }

    @Override
    public Student getStudent(int student_ID) {
        RowMapper<Student> rmi = new RowMapperImpl();
        String query = "select * from student where Id=?";
        Student student = jdbcTemplate.queryForObject(query,rmi,student_ID);
        return student;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
