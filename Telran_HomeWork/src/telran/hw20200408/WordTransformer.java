package telran.hw20200408;

public class WordTransformer {
    //First method
    public static String transform(String input) {
        return transform(input, new WordTransformerUpperCase3());

    }

    //Method with extra parametr
    public static String transform(String input, WordTransformerAction c) {
        String[] strTemp = input.split(" ");
        for (int i = 0; i < strTemp.length; i++) {
            if (c.check(strTemp[i])) {
                strTemp[i] = c.change(strTemp[i]);
            }
        }
        return String.join(" ", strTemp);
    }
}
