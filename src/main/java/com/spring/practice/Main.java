package com.spring.practice;

import com.spring.Interface.StudentInterface;
import com.spring.Interface.StudentInterfaceImpl;
import com.spring.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println( "This is the Beginning of my project" );
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/com/spring/practice/config.xml");

//        StudentInterfaceImpl stifobj = ac.getBean("stifi", StudentInterfaceImpl.class);
//                                        ||  OR   ||
        StudentInterface stif = ac.getBean("stifi", StudentInterface.class);

//        Without using interface :
//        Not an industry standard
//        Insert query
//        String query = "insert into student values(?,?,?,?)";
//        Fire Query
//        int result = jt.update(query,1222,"Pratik Bansod","Pune","Gaming");

//        By using Interface :
//        An industry standard

//        Student std = new Student();
//        Insert Operation
//        std.setId(12);
//        std.setName("Bhavesh Patil");
//        std.setCity("Pune");
//        std.setHobby("Reading");
//        int result = stif.insert(std);
//        System.out.println(result+" rows inserted!!!");

//        Update Operation
//        Student std = new Student();
//        std.setId(12);
//        std.setName("Bhavesh Sanjay Patil");
//        std.setCity("Pune");
//        std.setHobby("Wide Extensive Reading");
//        int result = stif.update(std);
//        System.out.println(result+" rows updated!!!");

//        Delete operation
        Student std = new Student();
        std.setId(122222);
        int result = stif.delete(std);
        System.out.println(result+" rows deleted!!!");
    }
}