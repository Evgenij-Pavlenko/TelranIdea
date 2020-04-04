package telran.controller;

import telran.data.Book;
import telran.data.Newspaper;
import telran.data.Printable;

public class PrintableApp {

    public static void main(String[] args) {
        Book book1 = new Book("The little prince", "Saint-Exupery");
        Printable book2 = new Book("War and Peace", "Tolstoy");
        Printable newspaper = new Newspaper();

        Printable.print1();
        book1.print();
        newspaper.print();
    }
}
