package com.linkedin.javacodechallenges;

public class Person {
    private short age;
    private String fName;
    private String lName;

    public Person(String fName, String lname) {
        this.age = 0;
        this.fName = fName;
        this.lName = lname;
    }
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
    public void introduction() {
        System.out.printf("Hello! My name is %s %s. I am %d years old", this.fName, this.lName, this.age);
    }
}
