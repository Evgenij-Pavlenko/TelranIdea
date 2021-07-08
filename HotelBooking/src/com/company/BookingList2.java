package com.company;



public class BookingList2 {
    public static void main(String[] args) {


    }

    private Node first=null;
    private  Node last = null;
    private int size =0;

    public void add(Booking booking){
        Node node = new Node();
        node.setBooking(booking);
        if(first==null){
            node.setPrev(null);
            node.setNext(null);
            first=node;
        }else{
            last.setNext(node);
            node.setNext(null);
            node.setPrev(last);
        }
        last=node;
        size++;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node currentNode=this.first;
        while(currentNode!=null){
            sb.append("( "+currentNode.getBooking().toString()+" )\n");
            currentNode=currentNode.getNext();
        }
     return sb.toString();
    }
}

class Node {
    private Booking booking = null;
    private Node prev=null;
    private  Node next=null;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
