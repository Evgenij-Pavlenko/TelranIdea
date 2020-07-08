package com.company;

public class SomeClass extends ParentClass implements Comparable {
    private   String s1 = "test";
     private String s2 = "test2";

    public SomeClass(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public SomeClass() {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}
