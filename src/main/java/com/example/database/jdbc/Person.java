package com.example.database.jdbc;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private String location;
    private Date birthdate;

    public Person(int id, String name, String location, Date birthdate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthdate = birthdate;
    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}
