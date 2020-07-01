package telran;

import sun.security.mscapi.CPublicKey;

import java.util.ArrayList;
import java.util.List;

public class Box4 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

//        numberList = integerList; // error

        Integer[] integerArr = new Integer[5];
        Number[] numberArr = new Number[5];
        Object[] objectArr = new Object[5];

        objectArr = numberArr;


    }

    //только для чтения
    public static <T> double additionfl1(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
//        list.add(10); // ошибка
        return 0;
    }


//PECS
    //Для записи
public static <T> double additionfl2(List<? super Integer> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//        list.add(10); // ошибка
        return 0;
    }

// <T> - типизирован. copy(откуда(предки), куда(потомки)). Наоборот - нельзя
    public  static <T> void copy(List<? super T>  dest, List<? extends T> src){

    }
}
