package Test;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

    }
    /*
hell   ohlle -> true  // разница в 1 букву
hello   hillo -> false
hello   hleo -> true
hello  hleol -> false

 */
    public static boolean isStringIsMutationEachOther2(String s1,String s2) {
        if ((s1 != null) && (s2 != null) && Math.abs((s1.length() - s2.length())) == 1) {
            if (s1.equals(s2))
                return true;
        }
        return false;
    }
}
