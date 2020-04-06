package telran.controller;

import telran.data.*;

public class PrintableApp {

    public static void main(String[] args) {
        Book book1 = new Book("The little prince", "Saint-Exupery");
        Printable book2 = new Book("War and Peace", "Tolstoy");
        Printable newspaper = new Newspaper();
        Printable journal = new Journal("Spiegel");
        WaterPipe pipe = new WaterPipe();
        Printable.print1();
        book1.print2();
        newspaper.print2();
        System.out.println("---------------------" );

        Printable[] printables = {book1, book2, newspaper, journal, pipe};
        for (Printable p: printables){
            p.print();
        }
        System.out.println("------------------");
        pipe.printState(3);

        Printable book3 = createPrintable("Ulysses", true);
        book3.print();
        ((Book)book3).setAutor("Joyce");
        book3.print();
        Printable journal2 = createPrintable("National geografick", false);
        System.out.println(journal2.getClass());
    }
    static Printable createPrintable(String name, boolean option){
        if (option){
            return new Book(name, "Undefined");
        }else{
            return new Journal(name);
        }
    }
}
