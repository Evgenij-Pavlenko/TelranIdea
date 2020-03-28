package com.company;

public class Person {
    private String name;
    private int age;

    Person (String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' + ((age!=0)?age:"" )+
                '}';
    }
}
