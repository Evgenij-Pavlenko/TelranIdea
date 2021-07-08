package com.company;

import java.util.Comparator;

public class DateComparator2 implements Comparator<Date> {
    @Override
    public int compare(Date o1, Date o2) {
        return o1.getDay()-o2.getDay();
    }
}
