package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        // create Rooms
        Room[] rooms= {
                new StandardRoom("1"),
                new SuiteRoom("2"),
                new DeLuxeRoom("3",2,100),
                new DeLuxeRoom("4")
        };

        for (int i=0;i<rooms.length;i++){
            System.out.println(rooms[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        // create persons
        Person p1= new Person("Ivan Ivanov");
        Person p2= new Person("Stepan Petrov");
        Person p3= new Person("Oleg Andreev");
        Person p4= new Person("Nick Jeferson");

        // create bookings
        Booking b1=new Booking(p1, rooms[2],new Date(1,4,2020),new Date (10,4,2020));
        Booking b2=new Booking(p1, rooms[2],new Date(15,4,2020),new Date (17,4,2020));
        Booking b3=new Booking(p2, rooms[1],new Date(3,3,2020),new Date (4,3,2020));
        Booking b4=new Booking(p3, rooms[0],new Date(29,3,2020),new Date (4,4,2020));



        BookingList bookingList = new BookingList();
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        bookingList.add(b4);

        bookingList.display();
        bookingList.display(p1);
        bookingList.displayLast(2);
        bookingList.remove(b3);
        System.out.println("Display bookingList after removing");
        bookingList.display();


        Date d1= new Date(1, 10, 2020);
        Date d2= new Date(20, 10, 2020);
        Date d3= new Date(10, 10, 2020);
        Date d4= new Date(25, 10, 2020);
        System.out.println(Date.isIntersect(d1, d2, d3, d4)); //true
        System.out.println(Date.isIntersect(d1, d3, d2, d4)); //false
        System.out.println(Date.isIntersect(d2, d1, d2, d4)); //true

        System.out.println("-------------------------------------------------------------------------------------------");
        Date d5= new Date(31, 12, 2020);
        Date d6= new Date(1, 1, 2018);
        System.out.println(d5.daysFromNY());// 366
        System.out.println(d5.daysToNY());//0
        System.out.println(Date.getDaysBetween(d5,d6));//365

        System.out.println("------- test list -------");
        BookingList2 bookingList2 = new BookingList2();
        System.out.println(bookingList2);
        bookingList2.add(b1);
        bookingList2.add(b2);
        System.out.println(bookingList2);


        Set<Date> treeSet = new TreeSet<>(new DateComparator());
        treeSet.add(d1);
        treeSet.add(d2);
        treeSet.add(d3);
        treeSet.add(d1);
        System.out.println(treeSet.size());
        System.out.println(treeSet);

        Date d7= new Date(12, 10, 2018);
        Date d8= new Date(12, 12, 2018);
        System.out.println("-------------------------- treeSet2");
        Set<Date> treeSet2 = new TreeSet<>(new DateComparator2());
        treeSet2.addAll(treeSet);
        treeSet2.add(d7);
        treeSet2.add(d8);
        System.out.println(treeSet2.size());
        System.out.println(treeSet2);

        System.out.println("-------------------------- treeSet3");
        Set<Date> treeSet3 = new TreeSet<>(new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.getMonth()-o2.getMonth();
            }
        });
        treeSet3.addAll(treeSet2);
        System.out.println(treeSet3.size());
        System.out.println(treeSet3);

    }
}
