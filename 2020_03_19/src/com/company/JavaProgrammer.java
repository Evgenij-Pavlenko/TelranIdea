package com.company;

public class JavaProgrammer extends Programmer {
    public JavaProgrammer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public JavaProgrammer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void doWork() {
        System.out.println("I'm Java Programmer/ I write super project");
    }

}
