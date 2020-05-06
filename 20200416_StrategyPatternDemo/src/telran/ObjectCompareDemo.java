package telran;

import javax.crypto.spec.PSource;

public class ObjectCompareDemo {
    public static void main(String[] args) {


        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.equals(o2));
        System.out.println(compareToObject(o1, o2));
        int a = 5;
        int b = 10;

        System.out.println(a == b);
    }

    public boolean compareTwoInts(int a, int b) {
        return a == b;
    }

    public static boolean compareToObject(Object o1, Object o2) {
        return o1 == o2;
    }
}
