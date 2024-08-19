package com.spring.practice;

import com.spring.Interface.StudentInterface;
import com.spring.Interface.StudentInterfaceImpl;
import com.spring.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println( "This is the Beginning of my project" );
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/com/spring/practice/config.xml");

//        StudentInterfaceImpl stifobj = ac.getBean("stifi", StudentInterfaceImpl.class);
//                                        ||  OR  ||
        StudentInterface stif = ac.getBean("stifi", StudentInterface.class);
//                                        ||  OR  ||
//        StudentInterface stif = (StudentInterface) ac.getBean("stifi");

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
//        std.setId(21);
//        std.setName("Sahil Nikam");
//        std.setCity("Pune");
//        std.setHobby("Refurbmishing");
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
//        Student std = new Student();
//        std.setId(122222);
//        int result = stif.delete(std);
//        System.out.println(result+" rows deleted!!!");

//        Single Student Select Operation
//        Student std = stif.getStudent(12);
//        System.out.println(std);

//        Multiple Student selection :
        List<Student> mystdlist = stif.getAllStudents();
        for(Student s : mystdlist){
            System.out.println(s);
        }
    }
}