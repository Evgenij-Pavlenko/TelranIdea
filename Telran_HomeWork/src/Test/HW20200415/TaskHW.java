package Test.HW20200415;

import java.util.Arrays;

/*
hell   ohlle -> true  // разница в 1 букву
hello   hillo -> false
hello   hleo -> true
hello  hleol -> false

 */
public class TaskHW {
    public static void main(String[] args) {

        System.out.println(isStringIsMutationEachOther2("hello", "hleo"));

    }

    public static boolean isStringIsMutationEachOther2(String s1, String s2) {
        if (((s1 != null) && (s2 != null)) && Math.abs((s1.length() - s2.length())) == 1) {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            // бред какойто. Если использовать цикл в цикле - непонятно, что делать с двойной буквой
            //есть какой-то метод у String еще? типа StringUtils.containsOnly()
           if (ch1.length>ch2.length){
               s1 = String.valueOf(ch1);
               s2 = String.valueOf(ch2);
           }else{
               s1 = String.valueOf(ch2);
               s2 = String.valueOf(ch1);
           }
            return s1.contains(s2);
        }
        return false;
    }
}
