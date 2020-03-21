package telran.dao;

import telran.data.Film;

import static telran.data.Cinema.isCinemaInArray;

public class Schedule {
    private Film[] films;
    private int size;

    public Schedule(int capacity) {
        films = new Film[capacity];
        size = 0;
    }

    public boolean addFilm(Film film) {
        if (size < films.length) {
            films[size] = film;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteFilm(Film film) {
        for (int i = 0; i < size; i++) {
            if (films[i].equals(film)) {
                films[i] = films[size - 1];
                size--;
                return true;
            }

        }
        return false;
    }

    public void displayFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(films[i]);
        }
    }

    public void displayFilmByDate(String date) {
        System.out.println(date + " you can see following films");
        for (int i = 0; i < size; i++) {
            if (films[i].getDate().equalsIgnoreCase(date)) {
                System.out.println(films[i].getTitle() + " / " + films[i].getGenre());
                films[i].displayCinema();
                System.out.println("--------------------");
            }
        }
    }

    public void displayFilmByCinema(String name) {
        System.out.println("In cinema " + name + " you can watch");
        for (int i = 0; i < size; i++) {
            if (isCinemaInArray(films[i].getCinemas(), name)) {
                System.out.println(films[i].getTitle() + " / " + films[i].getGenre() + " / " +
                        films[i].getDate());
                System.out.println("--------------------");
            }

        }
    }

    public int getIndexOfFilm(String title) {
        int indexOfFilm = -1;
        for (int i = 0; i < size; i++) {
            if (films[i].getTitle().equalsIgnoreCase(title)) {
                indexOfFilm = i;
            }
        }
        return indexOfFilm;
    }

    public void displayCinemaByTitle(String title) {
        System.out.println("-------displayCinemaByTitle--------");
        int index = getIndexOfFilm(title);
        if (index < 0) {
            System.out.println("Sorry, the movie is not in schedule");
        } else {
            System.out.println("You can watch " + title + " " + films[index].getDate() +
                    " in following cinema ");
            films[index].displayCinema();

        }

    }

    public void displayCinemaByTitle2(String title) { // 2 in 1
        System.out.println("--------displayCinemaByTitle2--------");
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (films[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("You can watch " + title + " " + films[i].getDate() +
                        " in following cinema ");
                films[i].displayCinema();
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Sorry, the movie is not in schedule");
        }
    }

    public void displayCinemaByGenre(String genre) {
        System.out.println("----------displayCinemaByGenre--------");
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (films[i].getGenre().name().equalsIgnoreCase(genre)) {
                System.out.println("You can watch " + films[i].getGenre() + " " + films[i].getTitle() + " " + films[i].getDate() +
                        " in following cinema ");
                films[i].displayCinema();
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Sorry, the genre \"" + genre + "\" is not in schedule");
        }
    }
}
