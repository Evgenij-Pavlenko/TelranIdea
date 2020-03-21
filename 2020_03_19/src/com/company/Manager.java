package com.company;

public class Manager extends Employee {
    public Manager(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString()+ "}";
    }
    public void pay(){
//        System.out.println(getName());
        System.out.println("I'm manager " + ((getExperience()<5)? getSalary(): getSalary()+3000));
    }

    public void doWork(){
        System.out.println("I'm manager ");
    }
    @Override
    public String getName(){
        return "Sir" + super.toString();

    }
}
