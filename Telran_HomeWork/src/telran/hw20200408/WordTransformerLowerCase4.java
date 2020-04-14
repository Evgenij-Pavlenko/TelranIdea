package telran.hw20200408;

public class WordTransformerLowerCase4 implements WordTransformerAction {
    @Override
    public boolean check(String word) {
        return word.length() == 4;
    }

    @Override
    public String change(String word) {
        return word.toLowerCase();
    }
}
