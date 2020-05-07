package com.company;

import java.util.Comparator;

public class DateComparator2 implements Comparator<Date> {
    @Override
    public int compare(Date date1, Date date2) {
        if (date1.getDay() != date2.getDay()) {
            if (date1.getDay() > date2.getDay()) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
