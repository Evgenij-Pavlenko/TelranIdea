package telran.secretNumber20200416;

public class SmallerState implements NumberState {
    @Override
    public void compare(int i) {
        System.out.printf("You number %d is smaller.\n", i);
    }
}
