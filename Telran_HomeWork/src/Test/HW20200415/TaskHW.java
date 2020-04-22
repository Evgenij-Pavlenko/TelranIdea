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
            int count = 0;
            // бред какойто. Если использовать цикл в цикле - непонятно, что делать с двойной буквой
            //есть какой-то метод у String еще? типа StringUtils.containsOnly()
            if (ch1.length > ch2.length) {
                for (int i = 0; i < ch2.length; i++) {
                    if (ch2[i] == ch1[i]) {
                        count++;
                    }else{
                        if (ch2[i]==ch1[i+1]){
                            count++;
                        }
                    }
                    if (count==ch2.length-1){
                        return true;
                    }
                }
            } else {
                for (int i = 0; i < ch1.length; i++) {
                    if (ch1[i] == ch2[i]) {
                        count++;
                    }else{
                        if (ch1[i]==ch2[i+1]){
                            count++;
                        }
                    }
                    if (count==ch1.length-1){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
