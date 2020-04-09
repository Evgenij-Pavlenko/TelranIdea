package telran20200407;

public class WordTransformerNew {


    //transform("aaa bcDE eklm iii") -> "AAA bcDE eklm III"
    //length == 3 -> to UpperCase
    public static String transform3Letter(String input) {
        String temp = "";
        String[] str = input.split(" ");
        for (String s : str) {
            if (s.length() == 3) {
                temp += s.toUpperCase() + " ";
            } else {
                temp += s + " ";
            }
        }
        return temp.trim();
    }

    //transform("aaa bcDE ekLm iii") -> "aaa bcde eklm iii"
    //length == 4 -> to LowerCase
    public static String transform4Letter(String input) {
        String temp = "";
        String[] str = input.split(" ");
        for (String s : str) {
            if (s.length() == 4) {
                temp += s.toLowerCase() + " ";
            } else {
                temp += s + " ";
            }
        }
        return temp.trim();

    }

    //этот же метод заменял слова, начинающиеся на 'a' на звездочку. То есть 'aBcdE' -> '*****'
    public static String transformStar(String input, String start) { // kann char make
        String[] str = input.split(" ");
        String temp = "";
        for (String s : str) {
            //Kann with str.IgnoreCase make
            if (s.startsWith(start)) {
                temp += s.replaceAll(".", "*") + " ";
            } else {
                temp += s + " ";
            }
        }
        return temp.trim();
    }

    public static String transform(String input){
        return transform3Letter(input);
    }
    public static String transform(String input, int param) {
        if (param == 3) {
            return transform3Letter(input);
        } else if (param == 4) {
            return transform4Letter(input);
        }
        return "Wrong Param";
    }

    public static String transform(String input, String start) {
        return transformStar(input, start);
    }

    // universal method
    public static String transform(String input, int param, String start) {
        switch (param) {
            case 0:
                return transformStar(input, start);
            case 3:
                return transform3Letter(input);
            case 4:
                return transform4Letter(input);
            default:
                return "Wrong Param";
        }
    }
}
