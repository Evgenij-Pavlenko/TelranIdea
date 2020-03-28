package com.company;

public class Main {
    public static void main(String[] args) {
        //Person
        //Date
        //Room

        Person p1 = new Person("Ivan");
//        System.out.println(p1);

        Room r1 = new Room("1");
//        System.out.println(r1);

        Date d1 = new Date(1, 10, 2020);
        Date d2 = new Date(20, 10, 2020);

        Booking b1 = new Booking(p1, r1, d1, d2);
//        System.out.println(b1);

        Person p2 = new Person("Jack", 20);
        Booking b2 = new Booking(p2, r1, d1, d2);
//        System.out.println(b2);
        System.out.println("------------Home work--------------");
        Room standartRoom1 = new StandartRoom("3");
        Room standartRoom2 = new StandartRoom("4", 2);
        Room suiteRoom1 = new SiuteRoom("5", 3);
        Room deLuxeRoom1 = new DeLuxeRoom("6", 4);


        Booking b3 = new Booking(p1, standartRoom1, d1, d2);
        Booking b4 = new Booking(p1, standartRoom2, d1, d2);
        Booking b5 = new Booking(p1, suiteRoom1, d1, d2);
        Booking b6 = new Booking(p1, deLuxeRoom1, d1, d2);

        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        standartRoom2.doService();
        suiteRoom1.doService();
        deLuxeRoom1.doService();

        BookingsList bookingsList = new BookingsList(50);

        bookingsList.add(b1);
        bookingsList.add(b2);
        bookingsList.add(b3);
        bookingsList.add(b4);
        bookingsList.add(b5);
        bookingsList.add(b6);
        System.out.println("--------Display All-------------");
        bookingsList.display();
        System.out.println("--------delete-------------");
        bookingsList.remove(b2);
        bookingsList.display();
        System.out.println("--------Display last \'n\' booking -------------");
        bookingsList.display(2);
        System.out.println("--------Display person's bookings-------------");
        bookingsList.display(p2);


    }
}