package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        myMethod(new MyInterfaceImpl2());
        myMethod1("Jack", new MyFunctImpl());
        myMethod1("Jack", new MyFunction() {
            @Override
            public String doThis(String s) {
                return s.toUpperCase() + " hello anonim";
            }
        });

        MyFunction myFunction = s -> s.toLowerCase() + " test";
        MyFunction myFunction2 = s -> {
            StringBuffer sb = new StringBuffer();
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            return sb.toString();
        };
        myMethod1("Jack", myFunction2);
    }

    public static void myMethod(MyInterface myInterface) {
        myInterface.method1();
        myInterface.method2();
    }

    public static void myMethod1(String s, MyFunction myFunction) {
        String str = myFunction.doThis(s);
        System.out.println(str);
    }

}
