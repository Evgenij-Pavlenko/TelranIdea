package com.company;

public class Programmer extends Employee {
    public Programmer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString()+"}";
    }
    public void pay(){
        System.out.println("I've got " + ((super.getExperience()<5)? getSalary(): getSalary()+3000));
    }

    public void doWork(){
        System.out.println("I'm Programmer/ I write super project");
    }
}
