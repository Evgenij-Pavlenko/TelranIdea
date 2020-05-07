package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static com.company.Date.dayBetweenDate;
import static com.company.Date.isIntersect;

public class Main {
    public static void main(String[] args) {
        //Person
        //Date
        //Room

        Person p1 = new Person("Ivan");
//        System.out.println(p1);

        Room r1 = new StandartRoom("1");
//        System.out.println(r1);

        Date d1 = new Date(1, 10, 2020);
        Date d2 = new Date(20, 10, 2020);
        Date d3 = new Date(11, 4, 2020);
        Date d4 = new Date(21, 5, 2020);

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
        System.out.println("-----------isIntersect -------------");
        System.out.println(isIntersect(d1, d2, d3, d4));
        System.out.println("-----------isRoomFrei -------------");
        System.out.println(b1.isRoomFrei(bookingsList, r1, d2, d4));
        System.out.println("-----------dayBetweenDate -------------");
        System.out.println(dayBetweenDate(d1, d2));

        System.out.println("---------------test list------------");
        BookingList2 bookingList2 = new BookingList2();
        bookingList2.add(b1);
        bookingList2.add(b2);
        bookingList2.print();
        System.out.println("-------------TreeSet--------------");
        Set<Date> treeSet = new TreeSet<>(new DateComparator());
        treeSet.add(d1);
        treeSet.add(d2);
        treeSet.add(d3);
        treeSet.add(d3);
        System.out.println(treeSet);
        System.out.println("-------------TreeSet2--------------");

        Date d7 = new Date(12, 10, 2018);
        Date d8 = new Date(12, 12, 2018);

        Set<Date> treeSet2 = new TreeSet<>(new DateComparator2());
        treeSet2.addAll(treeSet);
        treeSet2.add(d7);
        treeSet2.add(d8);
        System.out.println(treeSet2);
        System.out.println("-------------TreeSet3--------------");
        // Анонимный класс
        Set<Date> treeSet3 = new TreeSet<>(new Comparator<Date>() {
            @Override
            public int compare(Date date1, Date date2) {
                if (date1.getMonth() != date2.getMonth()) {
                    if (date1.getMonth() > date2.getMonth()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
                return 0;
            }
        });
        treeSet3.addAll(treeSet2);
        System.out.println(treeSet3.size());
        System.out.println(treeSet3);


    }
}