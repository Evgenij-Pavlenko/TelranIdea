package telran.secretNumber20200416;

public class LargerState implements NumberState{
    @Override
    public void compare(int i) {
        System.out.printf("You number %d is larger.\n", i);
    }
}
