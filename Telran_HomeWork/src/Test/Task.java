package Test;

import java.util.Arrays;

/*
hello   ohlle -> true
hello   hillo -> false
hello   helo -> false

 */

public class Task {
    Task test = new Task();

    public static void main(String[] args) {
        isStringIsMutationEachOther("hello", "ohlle");

    }

    public static boolean isStringIsMutationEachOther(String s1,String s2) {
        if ((s1 != null) && (s2 != null) && (s1.length() == s2.length())) {
            if (s1.equals(s2))
                return true;

            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
        return (new String(ch1)).equals(new String(ch2));  // работает и так
//            return Arrays.equals(ch1,ch2);   // и так
//            return ch1 == ch2;  // и так
        }

        return false;
    }

}




