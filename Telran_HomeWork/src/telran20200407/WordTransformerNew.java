package telran20200407;

public class WordTransformerNew {

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

    public static String transform(String input, int param) {
        switch (param) {
            //transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
            //length == 3 -> to UpperCase
            case 3:
                return transform(input);
            //transform("aaa bcDE ekLm iii") -> "aaa bcde eklm iii"
            //length == 4 -> to LowerCase
            case 4:
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
            default:
                return "Param is wrong";
        }
    }

    //этот же метод заменял слова, начинающиеся на 'a' на звездочку. То есть 'aBcdE' -> '*****'
    public static String transform(String input, String start) { // kann char make
//        public static String transform(String input, int param, String start) - непонятно - тут нужен параметр, который делает toUpperCase?
        String[] str = input.split(" ");
        String temp = "";
        for (int i = 0; i < str.length; i++) {
            //Kann with str.IgnoreCase make
            if (str[i].startsWith(start)) {
                temp += str[i].replaceAll(".", "*") + " ";
            } else {
                temp += str[i] + " ";
            }
        }
        return temp.trim();
    }
}
