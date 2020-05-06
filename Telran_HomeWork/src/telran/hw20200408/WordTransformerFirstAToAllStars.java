package telran.hw20200408;

public class WordTransformerFirstAToAllStars implements WordTransformerAction {
    @Override
    public boolean check(String word) {
        return word.startsWith("a");
    }

    @Override
    public String change(String word) {
        return word.replaceAll(".", "*");
    }
}
