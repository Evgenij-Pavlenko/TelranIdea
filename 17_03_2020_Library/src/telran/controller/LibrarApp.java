package telran.controller;

import telran.dao.Library;
import telran.data.Book;

public class LibrarApp {
    public static void main(String[] args) {

        Book book1 = new Book("Winnie the Pooh", "Alex Milan", 350, 1952 );
        Book book2 = new Book("Harry Potter", "Joan Roulings", 435, 1960 );
        Book book3 = new Book("Sherlock Holms", "Artur Conan Doyle", 388, 1892 );
        Book book4 = new Book("War and Peace", "Lev Tolstoy", 350, 1868 );
        Book book5 = new Book("Capital", "Karl Marx", 1200, 1867 );
        Library myLab = new Library(100);
        myLab.addBook(book1);
        myLab.addBook(book2);
        myLab.addBook(book3);
        myLab.addBook(book4);
        myLab.addBook(book5);

        myLab.display();
        myLab.deleteBook(book2);
        System.out.println();
        myLab.display();
        System.out.println();
        myLab.searchBookByAuthor("Alex Milan");
        System.out.println("--------Old Book ----------");
        myLab.searchOldBook();

    }
}
