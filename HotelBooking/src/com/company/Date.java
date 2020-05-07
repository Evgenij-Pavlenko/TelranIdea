package com.company;

import java.util.Random;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;
    private Random rnd = new Random(System.currentTimeMillis());


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String toString() {
        String s = "Date: " + day + ".";
        s += month + ".";
        s += year;
        return s;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public static void print(Date[] dates) {
        for (int i = 0; i < dates.length; i++) {
            dates[i].print();
        }
    }

    public boolean isCorrect() {
        return isCorrectYear() &&
                isCorrectMonth() &&
                isCorrectDay();
    }

    private boolean isCorrectYear() {
        return (year > 0);
    }

    private boolean isCorrectMonth() {
        return (month > 0) && (month <= 12);
    }

    public boolean isCorrectDay() {
        if ((day > 0) && (day <= getDayPerMonth())) {
            return true;
        } else {
            return false;
        }
    }

    public int getDayPerMonth() {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear() && (month == 2)) {
            return 29;
        } else {
            return days[month - 1];
        }
    }


    public boolean isLeapYear() {
        return (
                ((year % 4 == 0) && (year % 100 != 0)) ||
                        (year % 400 == 0)
        );
    }

    public static boolean isLeapYear(int year) {
        return (
                ((year % 4 == 0) && (year % 100 != 0)) ||
                        (year % 400 == 0)
        );
    }


    public Date getRandomDate() {
        Date date;
        do {
            int year = getRandomInt(1900, 2030);
            int month = getRandomInt(1, 12);
            int day = getRandomInt(1, 31);
            date = new Date(day, month, year);
        } while (!date.isCorrect());

        return date;

    }


    private int getRandomInt(int min, int max) {
        return min + rnd.nextInt(max - min + 1);
    }

    @Override
    public int compareTo(Date date) {
        if (this.year != date.year) {
            if (this.year > date.year) {
                return 1;
            } else {
                return -1;
            }
        }
        if (this.month != date.month) {
            if (this.month > date.month) {
                return 1;
            } else {
                return -1;
            }
        }
        if (this.day != date.day) {
            if (this.day > date.day) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }

    public static int comparatorDate(Date date1, Date date2) {
        if (date1.year != date2.year) {
            return date1.year - date2.year;
        }
        if (date1.month != date2.month) {
            return date1.month - date2.month;
        }
        return date1.day - date2.day;
    }


    public static void sort(Date[] dates) {

        for (int i = 0; i < dates.length; i++) {
            for (int j = 0; j < (dates.length - 1) - i; j++) {
                if (comparatorDate(dates[j], dates[j + 1]) > 0) {
                    Date tmp = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = tmp;
                }
            }
        }
    }

    public static boolean isIntersect(Date start1, Date end1, Date start2, Date end2) {
        boolean one = (comparatorDate(end1, start2) < 0) ? false : true;
        boolean two = (comparatorDate(end2, start1) < 0) ? false : true;
        return one || two;
    }

    public static int dayBetweenDate(Date d1, Date d2) {
        if (!(d1.isCorrect() && d2.isCorrect())) {
            System.out.println("Date isn't correct");
            return 0;
        }
        int resDayYear = 0;
        if (comparatorDate(d1, d2) == 0) {
            System.out.println("Date is equals");
            return 0;
        } else if (comparatorDate(d1, d2) > 0) {
            for (int i = 0; i < (d1.year - d2.year); i++) {
                if (d1.month == d2.month) {
                    return d1.day - d2.day;
                } else {
                    if (d1.month > d2.month) {
                        for (int j = d1.month; j > d1.month - d2.month; j--) {
                            Date tempDate = new Date(0, 0, 0);
                            tempDate.setMonth(j);
                            resDayYear = tempDate.getDayPerMonth();
                        }
                    } else {
                        for (int j = d1.month; j > 0; j--) {
                            Date tempDate = new Date(0, 0, 0);
                            tempDate.setMonth(j);
                            resDayYear = tempDate.getDayPerMonth();
                        }
                        for (int j = 12; j > 12 - d2.month; j--) {
                            Date tempDate = new Date(0, 0, 0);
                            tempDate.setMonth(j);
                            resDayYear = tempDate.getDayPerMonth();
                        }
                        //должен быть другой способб чем городить else if and for
                        // c библиотекой Date намного проще ))
                    }

                }

            }
        }
        return resDayYear;
    }


    // 8-3+1
    //   0 1 2 3 4 5 6 7 8 9 10 11

}
