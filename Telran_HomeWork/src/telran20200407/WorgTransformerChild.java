package telran20200407;

public class WorgTransformerChild extends WordTransformer {

    //transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
    //length == 3 -> to UpperCase
    //transform("aaa bcDE ekLm iii") -> "aaa bcde eklm iii"
    //length == 4 -> to LowerCase
    public static String transform4(String input, boolean b) {
        if (b) {
            return transform(input);
        } else {
            String temp = "";
            String[] str = input.split(" ");
            for (int i = 0; i < str.length; i++) {
                if (str[i].length() == 4) {
                    temp += str[i].toLowerCase() + " ";
                } else {
                    temp += str[i] + " ";
                }
            }
            return temp.trim();
        }
    }
}
