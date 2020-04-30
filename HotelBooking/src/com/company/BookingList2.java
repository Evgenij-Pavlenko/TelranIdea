package com.company;

public class BookingList2 {
    private  Node first = null;
    private  Node last = null;
    private int size = 0;

    public void add(Booking booking){
        Node node = new Node();
        node.setBooking(booking);
        if (first==null){
            node.setPrev(null);
            node.setNext(null);
            first = node;
        }else{
            last.setNext(node);
            node.setNext(null);
            node.setPrev(last);
        }
        last = node;
        size++;
    }
    public void print(){

        Node node = first;
        while(node!=null){
            System.out.println(node.getBooking());
            node = node.getNext();
        }
        System.out.println("list size: " + size);
    }


}
class Node{
    private Booking booking = null;
    private Node prev = null;
    private Node next = null;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }
}
