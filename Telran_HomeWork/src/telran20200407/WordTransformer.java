package telran20200407;

public class WordTransformer {
    //transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
    //length == 3 -> to UpperCase
    public static String transform(String input) {
        String temp = "";
        String[] str = input.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == 3) {
                temp += str[i].toUpperCase() + " ";
            } else {
                temp += str[i] + " ";
            }
        }
        return temp.trim();
    }
}
