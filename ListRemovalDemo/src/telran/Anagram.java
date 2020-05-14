package telran;

import java.util.*;

public class Anagram {
    public static String[] list = {"ivan", "anna", "navi", "vani", "naan"};

    Map<String, List<String>> map = new HashMap<>();

    public Anagram(String[] voc) {
buildVocMap(list);
    }

    public List<String> getAnagrams(String word) {
        String sortedWord = sortWord(word);
        return map.get(sortedWord);
    }


    private String sortWord(String word) {
        // ivan =>ainv
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private void buildVocMap(String[] voc) {
        for (String word : voc) {
            String sortedWord = sortWord(word);
            List<String> strings = map.get(sortedWord);
            if (strings == null) {
                strings = new ArrayList<>();
                strings.add(word);
                map.put(sortedWord, strings);
            } else {
                strings.add(word);
            }
        }
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram(list);
        List<String> ivan = anagram.getAnagrams("ivan");
        System.out.println(ivan);
        List<String> anna = anagram.getAnagrams("anna");
        System.out.println(anna);
    }

}
