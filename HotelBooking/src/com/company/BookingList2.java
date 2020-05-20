package com.company;

public class BookingList2 {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    public void add(Booking booking) {
        Node node = new Node();
        node.setBooking(booking);
        if (first == null) {
            node.setPrev(null);
            node.setNext(null);
            first = node;
        } else {

            last.setNext(node);
            node.setNext(null);
            node.setPrev(last);
        }
        last = node;
        size++;
    }

    public Booking get(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return (Booking) node.getBooking();
    }

    private boolean removeNode(Node node) {
        boolean flag = false;
        if (node.equals(first)) {
            node.getNext().setPrev(null);
            flag = true;
        } else if (node.equals(last)) {
            node.getPrev().setNext(null);
            flag = true;
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            flag = true;
        }
        return flag;
    }

    public boolean remove(Booking booking) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (booking.equals(node.getBooking())) {
                removeNode(node);
                return true;
            }
            node = node.getNext();

        }
        return false;
    }

    public void print() {

        Node node = first;
        while (node != null) {

            System.out.println(node.getBooking());
            node = node.getNext();
        }
        System.out.println("list size: " + size);
    }


}


class Node {

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
