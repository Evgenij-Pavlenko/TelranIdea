package telran.controller;

import telran.dao.Shedule;
import telran.data.Cinema;
import telran.data.Genre;

public class CinemaApp {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Ost");
        Cinema cinema2 = new Cinema("Berlin");
        Cinema cinema3 = new Cinema("Star");

        Shedule sheduleOst = new Shedule();
        System.out.println(sheduleOst.getGenre().name());
        Shedule.getSheduleByGenre(Genre.ADVENTURE);
    }
}
