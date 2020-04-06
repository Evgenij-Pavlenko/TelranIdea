package com.company;

public class BookingsList {
    private Booking[] bookingsList;
    private int size = 0;

    public BookingsList(int capacity) {
        bookingsList = new Booking[capacity];
    }

    public Booking[] getBookingsList() {
        return bookingsList;
    }

    public int getSize() {
        return size;
    }

    public boolean add(Booking booking) {
        if (size < bookingsList.length) {
            bookingsList[size] = booking;
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(Booking booking) {
        for (int i = 0; i < size; i++) {
            if (bookingsList[i].equals(booking)) {
                bookingsList[i] = bookingsList[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookingsList[i]);
        }
    }
    public void display(int n){
        for (int i = size-n; i <size ; i++) {
            System.out.println(bookingsList[i]);

        }
    }
    public void display(Person person){
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (bookingsList[i].getPerson().equals(person)){
                System.out.println(bookingsList[i]);
                flag = false;
            }
        }
        if (flag)  System.out.println("Person " + person + " hav'nt booking");
    }
}
