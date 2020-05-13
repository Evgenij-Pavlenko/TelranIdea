package telran;

import java.util.*;

public class Main {

    static List<String> strings = Arrays.asList("123", "123", "567", "568", "782", "568");

    public static void main(String[] args) {
        System.out.println(wordCount(strings));
    }

    public static Map<String, Integer> wordCount(List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        //написать на основе frequency
        return map;
    }
}
