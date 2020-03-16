package telran.controller;

import telran.data.DayOfWeek;
import telran.data.Shedule;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(monday);
        System.out.println(sunday.ordinal());
        monday.printHello();
        System.out.println(monday.getTitle().replace("mo", "Mo"));
        System.out.println(monday.getTitle());
        System.out.println(Arrays.toString(DayOfWeek.values()));

        Shedule shedule = new Shedule();
        shedule.setDayOfWeek(DayOfWeek.MONDAY);
        shedule.wakeUp();
        shedule.getMenu(sunday);
    }
}
