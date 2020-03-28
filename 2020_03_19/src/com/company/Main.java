package com.company;

public class Main {
    public static void main(String[] args) {

//        Employee em1 = new Employee("Nick", 1000); // Employee ia abstract klass
        Employee em1 = new Programmer("Nick", 1000, 5); // Employee ia abstract klass
//        em1.
        System.out.println(em1);
        em1.doWork();
        em1.pay();
        System.out.println("---------------MANAGER--------------");
        Manager manager1 = new Manager("Erick", 2000);
        System.out.println(manager1);
        manager1.pay();
        System.out.println(manager1.getName());
        System.out.println("---------------PRIGRAMMER--------------");
        Programmer programmer1 = new Programmer("Max", 3000, 10);
        System.out.println(programmer1);
        programmer1.pay();
        programmer1.doWork();
        System.out.println(programmer1.getName());

        System.out.println("----------pay------------");
        Employee[] employees = {manager1, programmer1};
        for (int i = 0; i < employees.length; i++) {
            employees[i].pay();
            employees[i].doWork();
        }
        System.out.println("------------Programmer is an Employee--------------");
        Employee prog2 = new Programmer("Den", 1000, 4);
        prog2.doWork();


        ((Programmer) prog2).codeGenerate();

//        Programmer prog3 = (Programmer)em1;// error  - объект емплой
        Programmer prog4 = (Programmer) prog2; // not error объект программер
    }
}
