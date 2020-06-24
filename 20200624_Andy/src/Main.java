import javafx.print.Collation;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    // 10 -> [9,1] - есть ли парачисел, которые образовывает указанную сумму
    public static void main(String[] args) {
        int[] arr = {6, 9, -2, 7, 2, 1, 5};
        int[] arr4 = {-1, 1, 3, 6, 9, 12};
        int sum = 10;
        int[] res = findTwoNumber3(arr, 5);
        int[] res4 = findTwoNumber4(arr, 5);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findTwoNumber(int[] array, int n) {
        int[] res = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == n) {
                    res[0] = array[i];
                    res[1] = array[j];
                    return res;
                }
            }
        }
        System.out.println("Two number not found");
        return res;
    }

    public static int[] findTwoNumber3(int[] array, int n) {
        // a+b=n -> n-a=b
        //(n-array[i])
        //{6, 9, -2, 7, 2, 1, 5};
        //что-то не работает
        int[] res = new int[2];
        Set<Integer> intSet = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {

            if (intSet.contains(new Integer(n - array[i]))) {
                res[0] = array[i];
                res[1] = n - array[i];
            } else {
                intSet.add(array[i]);
            }
        }
        return res;
    }

    // for SortedArray
    public static int[] findTwoNumber4(int[] array, int n) {
        int[] res = new int[2];
        Arrays.sort(array);
//        {-1, 1, 3, 6, 9, 12}
        //     l ->           <- r
//        (array[l]+array[r])>n -> r двигаем влево, если больше - двигаем l вправо
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == n) {
                res[0] = array[left];
                res[1] = array[right];
                return res;
            } else {
                if (sum > n) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

//    public static int[] findTwoNumber2(int[] array, int n){
//        int[] res = new int[2];
//        for (int i = 0; i < array.length - 1; i++) {
//            int find = n-array[i];
//            res[0] = array[i];
//            int j = Arrays.binarySearch(array, n-array[i]);
//            if (j>0){
//            res[1] = j;
//
//            }
//            System.out.println(res[1]);
//        }
//        System.out.println("Two number not found");
//        return res;
//    }
}
