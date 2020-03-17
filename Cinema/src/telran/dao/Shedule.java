package telran.dao;

import telran.data.Genre;

public class Shedule {
    private Genre genre;

    public Genre getGenre() {
        return genre;
    }

    //    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
    public static void getSheduleByGenre(Genre genre) {
        switch ((genre)) {
            case COMEDY:
                System.out.println("\"The Diamond Arm\" / 25.10 / 20:00 (" + genre.name() + ")");
                break;
            case LOVE_STORY:
                System.out.println("\"Four weddings and one funeral\" / 27.10 / 21:00 (" + genre.name() + ")");
                break;
            case THRILLER:
                System.out.println("\"Four rooms\" / 30.10 / 19:00 (" + genre.name() + ")");
                break;
            case ADVENTURE:
                System.out.println("\"The fifth Element\" / 02.11 / 19:00 (" + genre.name() + ")");
                break;
        }
    }
}
