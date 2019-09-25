package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("Shivani Sajjan")
    private String name;
    @Value("Female")
    private String gender;
    @Value("22")
    private int age;

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
