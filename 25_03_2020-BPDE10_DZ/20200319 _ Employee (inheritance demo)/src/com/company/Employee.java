package com.company;

// IS A

public class Employee {
    private String name;
    private  int salary;
    private  int experience=0;
    protected  int temp;

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public void pay(){
        System.out.println("I've got "+ salary);
    }
    public void doWork(){
        System.out.println("Employee: do my work");
    }
}
