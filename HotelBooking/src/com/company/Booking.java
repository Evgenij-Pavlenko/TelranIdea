package com.company;

public class Booking {
    Person person;
    Room room;
    Date startDate;
    Date endDate;

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
