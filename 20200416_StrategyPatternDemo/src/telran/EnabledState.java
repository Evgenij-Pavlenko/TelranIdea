package telran;

public class EnabledState implements GadgetState {
    @Override
    public void doAction() {
        System.out.println("I am switched ON");
    }
}
