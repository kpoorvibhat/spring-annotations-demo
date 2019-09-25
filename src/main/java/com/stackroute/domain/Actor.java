package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {

    private String name;
    private String gender;
    private int age;

    @Autowired
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void actorInfo(){
        System.out.println(name + " " + gender + " Actor is acting at the age of " + age);
    }

}
