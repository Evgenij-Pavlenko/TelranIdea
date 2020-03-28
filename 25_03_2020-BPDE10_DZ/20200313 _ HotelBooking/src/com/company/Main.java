package com.company;

public class Main {

    public static void main(String[] args) {

        Person p1= new Person("Ivan");
        System.out.println(p1);

        Room r1 = new Room("1");
        System.out.println(r1);

        Date d1= new Date(1, 10, 2020);
        Date d2= new Date(20, 10, 2020);

        Booking b1 = new Booking(p1, r1, d1,d2 );
        System.out.println(b1);

        Person p2= new Person("Jack", 20);
        Booking b2 = new Booking(p2, r1, d1,d2 );
        System.out.println(b2);
    }
}
