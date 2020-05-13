package com.company;


import java.util.Arrays;

public class BookingList {
    private int capacity=100;
    private int size=0;
    private Booking[] bookings;


    public BookingList(int capacity) {
        this.capacity = capacity;
        bookings= new Booking[capacity];
    }

    public BookingList() {
        bookings= new Booking[capacity];
    }

    public boolean add(Booking booking){
        if (isBookingListFull()){
            // some actions which we do if we did't have place for put the Booking
            return false;
        }
        bookings[size]=booking;
        size++;
        return true;
    }

    public void remove(Booking booking){
        int index= find(booking);
        if(index>=0){
            size--;
            bookings[index]=bookings[size];
            bookings[size]=null;
        }
    }

    public int find(Booking booking){
        for (int i=0;i<size;i++){
            if(booking.equals(bookings[i])){
                return i;
            }
        }
        return -1;
    }

    public Booking[] get() {
        Booking[]  rezArray = new Booking[size];
        for (int i=0;i<size;i++){
            rezArray[i]=this.bookings[i];
        }
        return rezArray;
    }

    public Booking[] get(int n) {
        int index = size-n;
        if(index<0) {
            index=0;
        }
        Booking[]  rezArray = new Booking[n];
        for (int i=index,j=0;i<size;i++,j++){
            rezArray[j]=this.bookings[i];
        }
        return rezArray;
    }

    public Booking[] get(Person person) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (bookings[i].getPerson().equals(person)) {
                counter++;
            }
        }
        Booking[] rezArray = new Booking[counter];
        if (counter != 0) {
            for (int i = 0, j = 0; i < size; i++) {
                if (bookings[i].getPerson().equals(person)) {
                    rezArray[j] = bookings[i];
                    j++;
                }
            }
        }
        return rezArray;
    }

    public Booking getByIndex(int index) {
        if (index<size){
            return bookings[index];
        }
        return null;
    }

    public void display(){
        System.out.println("------------- Display all bookings --------");
        Booking[] arr = this.get();
        displayArrayOfBookings(arr);
        System.out.println("-------------------------------------------");
    }

    public void display(int index){
        System.out.println("------------- Display booking by index --------");
        Booking booking=this.getByIndex(index);
        if (booking!=null) {
            displayBooking(booking);
        }
        System.out.println("-------------------------------------------");
    }

    public void display(Person person){
        System.out.println("------------- Display bookings by person --------");
        Booking[] arr = this.get(person);
        displayArrayOfBookings(arr);
        System.out.println("-------------------------------------------");
    }

    public void displayLast(int n){
        System.out.println("------------- Display last n bookings --------");
        Booking[] arr = this.get(n);
        displayArrayOfBookings(arr);
        System.out.println("-------------------------------------------");
    }

    private void displayArrayOfBookings(Booking[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private void displayBooking(Booking booking){
            System.out.println(booking);
    }

    private boolean isBookingListFull() {
        return size>=capacity;
    }

    public boolean isBookingAvaliable(Booking booking){
        for (int i=0; i<size;i++){
            boolean sameRoom = booking.getRoom()==bookings[i].getRoom();
            boolean sameDate = Date.isIntersect( booking.getStartDate(), booking.getEndDate(),
                                                 bookings[i].getStartDate(), bookings[i].getEndDate());
            if(sameRoom&&sameDate){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookingList{" +
                "capacity=" + capacity +
                ", size=" + size +
                ", bookings=" + Arrays.toString(bookings) +
                '}';
    }
}
