package com.company;
/*
{
   [
     employee
        ....
    ][Manager  }
 }
 */


public class Manager extends Employee{

    public Manager(String name, int salary, int experience) {
        super(name,salary, experience);

    }

    public Manager(String name, int salary) {
        super(name,salary);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +'}';
    }

    @Override
    public void doWork(){
        System.out.println("I'am manager/ I say what programmers have to do");
    }

    @Override
    public String getName() {
        return "sir "+ super.getName();
    }

    @Override
    public  void pay(){
        //System.out.println(this.getName());
        System.out.println(temp);
        System.out.println("I've got "+ ((this.getExperience()<5)?this.getSalary():this.getSalary()+3000));
    }
}
