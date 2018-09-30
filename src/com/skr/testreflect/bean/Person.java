package com.skr.testreflect.bean;

public class Person {

    private String name;
    private int age;
    private String nickName;

    public Person(String name, int age, String nickName) {
        super();
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
