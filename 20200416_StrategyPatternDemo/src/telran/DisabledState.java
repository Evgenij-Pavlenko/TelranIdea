package telran;

public class DisabledState implements GadgetState {
    @Override
    public void doAction() {
        System.out.println("I am switched OFF");
    }
}
