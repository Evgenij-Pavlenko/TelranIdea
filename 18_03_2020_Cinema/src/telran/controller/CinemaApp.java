package telran.controller;

import telran.dao.Schedule;
import telran.data.Address;
import telran.data.Cinema;
import telran.data.Film;
import telran.data.Genre;

import static telran.data.Cinema.isCinemaInArray;

public class CinemaApp {
    public static void main(String[] args) {

        Cinema cinema1 = new Cinema("Thalia");
        Cinema cinema2 = new Cinema("Star", new Address("Hauptstrasse", 1));
        Address address = new Address("Berlinerstrasse", 16);
        Cinema cinema3 = new Cinema("Astra", address);
        Cinema cinema4 = new Cinema("Space");
        cinema1.setAddress(new Address("Hohenzollerdamm", 56));
        cinema4.setAddress(new Address("Wasserstrasse", 34));
//        cinema4.getAddress().setStreet("Wasserstrasse");
//        cinema4.getAddress().setHouseNumber(34);

        Cinema[] cinemas = {cinema1, cinema2, cinema3,cinema4};
        Cinema[] cinemas1 = {cinema1, cinema2};

        Film film1 = new Film("Harry Poter", "25.03", Genre.ADVENTURE, cinemas);
        Film film2 = new Film("Hail Ceaser", "26.03", Genre.COMEDY, cinemas);
        Film film3 = new Film("Titanic", "27.03", Genre.DRAMA, cinemas1);
        Film film4 = new Film("Figaro", "27.03", Genre.DRAMA, cinemas);

        Schedule schedule = new Schedule(20);
        schedule.addFilm(film1);
        schedule.addFilm(film2);
        schedule.addFilm(film3);
        schedule.addFilm(film4);

        schedule.displayFilms();

        System.out.println(isCinemaInArray(cinemas, "Astra"));
//        schedule.displayFilmByDate("27.03");
        schedule.displayFilmByCinema("Astra");
        schedule.displayCinemaByTitle("Hail Ceaser"); // переделать в 1 метод в schedule
        // добавить еще фильмы и сделать поиск по жанру


    }
}
