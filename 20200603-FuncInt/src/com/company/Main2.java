package com.company;

import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "I", "am", "Andrey"));
        System.out.println(list);
        for (String str: list){
            System.out.println(strHandler(str, s->s.length()>3, s->s.toUpperCase()));
        }
    }

    public static String strHandler(String s, Predicate<String> p, UnaryOperator<String> o) {
        return (p.test(s) ? o.apply(s) : s);
    }
}
