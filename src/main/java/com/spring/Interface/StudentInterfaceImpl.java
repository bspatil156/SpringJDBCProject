package com.spring.Interface;

import com.spring.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentInterfaceImpl implements StudentInterface {

    //    Declare a variable of type jdbcTemplate.
    JdbcTemplate jdbcTemplate;

    //    Inserts a student record in database.
//    We use jdbcTemplate.update() method to insert a record.*
    @Override
    public int insert(Student student) {
        String query = "insert into student values(?,?,?,?)";
        int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity(), student.getHobby());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "update student set Name=?,City=?,Hobby=? where Id=?";
        int result = jdbcTemplate.update(query, student.getName(), student.getCity(), student.getHobby(), student.getId());
        return result;
    }

    public int delete(Student student) {
        String query = "delete from student where Id=?";
        int result = jdbcTemplate.update(query, student.getId());
        return result;
    }

    @Override
    public Student getStudent(int student_ID) {
        RowMapper<Student> rmi = new RowMapperImpl();
        String query = "select * from student where Id=?";
        Student student = jdbcTemplate.queryForObject(query, rmi, student_ID);
        return student;
    }

    //    By using anonymous class :
//    Instead of creating a new RowMapper Implementation class i.e. 'RowMapperImpl' and
//    then creating an object of RowMapper interface with respect to RowMapperImpl,
//    We can write a anonymous class instead of 'rmi' object in queryForObject()
//    You just simply write the contents of mapRow() method inside this anonymous class.
//    public Student getStudent(int student_ID) {
//        String query = "select * from student where Id=?";
//        Student student = (Student) jdbcTemplate.queryForObject(query, new RowMapper() {
//            @Override
//            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student std = new Student();
//                std.setId(rs.getInt(1));
//                std.setName(rs.getString(2));
//                std.setCity(rs.getString(3));
//                std.setHobby(rs.getString(3));
//                return std;
//            }
//        }, student_ID);
//        return student;
//    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        RowMapper<Student> rmi = new RowMapperImpl();
        List<Student> stdlist = jdbcTemplate.query(query,rmi);
        return stdlist;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
