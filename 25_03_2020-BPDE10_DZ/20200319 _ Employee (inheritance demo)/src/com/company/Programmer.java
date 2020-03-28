package com.company;

public class Programmer extends Employee {


    public Programmer(String name, int salary, int experience) {
        super(name,salary,experience);
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() +
                '}';
    }

    public void doWork(){
        System.out.println("I'am programmer/ I write super project");
    }
    public  void pay(){
        System.out.println("I've got "+ ((this.getExperience()<5)?this.getSalary():this.getSalary()+2000));
    }

}
