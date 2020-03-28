package com.company;
/*
             Person
             Date          -> Boking
             Room
*/
public class Booking {

    private Person person;
    private Room room;
    private Date startDate;
    private Date endDate;

    public Booking(Person person, Room room, Date startDate, Date endDate) {
        this.person = person;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "person=" + person +
                ", room=" + room +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
