package com.company;

import java.util.Comparator;

public class DateComparator implements Comparator<Date> {
    @Override
    public int compare(Date date1, Date date2) {
        if (date1.getYear() != date2.getYear()) {
            if (date1.getYear() > date2.getYear()) {
                return 1;
            } else {
                return -1;
            }
        }
        if (date1.getMonth() != date2.getMonth()) {
            if (date1.getMonth() > date2.getMonth()) {
                return 1;
            } else {
                return -1;
            }
        }
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
