package com.company;

public class Date {
    int i1;
    int i2;
    int i3;

    public Date(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }

    @Override
    public String toString() {
        return "Date{" +
                "i1=" + i1 +
                ", i2=" + i2 +
                ", i3=" + i3 +
                '}';
    }
}

