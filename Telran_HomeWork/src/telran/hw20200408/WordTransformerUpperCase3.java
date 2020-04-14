package telran.hw20200408;

public class WordTransformerUpperCase3 implements WordTransformerAction {
    @Override
    public boolean check(String word) {
        return word.length() == 3;
    }

    @Override
    public String change(String word) {
        return word.toUpperCase();
    }
}
