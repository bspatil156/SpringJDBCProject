package com.spring.entities;

public class Student {
    int Id;
    String Name;
    String City;
    String hobby;

    public Student() {
    }

    public Student(String hobby, int id, String name, String city) {
        this.hobby = hobby;
        Id = id;
        Name = name;
        City = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
