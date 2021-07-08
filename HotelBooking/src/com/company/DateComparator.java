package com.company;

import java.util.Comparator;

public class DateComparator implements Comparator<Date> {
    @Override
    public int compare(Date date1, Date date2) {
        if (date1.getYear()!=date2.getYear()){
            return date1.getYear()-date2.getYear();
        }
        if (date1.getMonth()!=date2.getMonth()){
            return date1.getMonth()-date2.getMonth();
        }
        return date1.getDay()-date2.getDay();
    }
}
