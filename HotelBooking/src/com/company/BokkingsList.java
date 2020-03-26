package com.company;

public class BokkingsList {
    private Booking[] bookingsList;
    private int size = 0;

    public BokkingsList(int capacity) {
        bookingsList = new Booking[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean Bookind(Booking booking) {
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
}
