package com.company;

import java.util.Objects;

import static com.company.Date.isIntersect;

public class Booking {
    private Person person;
    private Room room;
    private Date startDate;
    private Date endDate;

    public Person getPerson() {
        return person;
    }

    public Room getRoom() {
        return room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Booking(Person person, Room room, Date startDate, Date endDate) {
        this.person = person;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking: " +
                "person=" + person +
                ", room=" + room +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(person, booking.person) &&
                Objects.equals(room, booking.room) &&
                Objects.equals(startDate, booking.startDate) &&
                Objects.equals(endDate, booking.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, room, startDate, endDate);
    }

    public boolean isRoomFrei(BookingsList bList, Room room, Date dStart, Date dEnd) {
        boolean resB = false;
        for (int i = 0; i < bList.getSize(); i++) {
            if (bList.getBookingsList()[i].getRoom()==room){
                boolean temp = false;
               temp = isIntersect(bList.getBookingsList()[i].startDate
                ,bList.getBookingsList()[i].endDate, dStart,dEnd);
               resB =  resB || temp; // true, wenn not frei
            }

        }
        if (resB){
            System.out.println("Room " + room + " is not frei in date " + dStart + " - " + dEnd);
        } else {
            System.out.println("Room " + room + " is frei in date " + dStart + " - " + dEnd);

        }
        return !resB;
    }
}