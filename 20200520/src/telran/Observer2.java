package telran;

public class Observer2 implements ObserverInterface {
    @Override
    public void handleEvent() {
        System.out.println("Observer2 receive msg from ObservedClass");
    }
}
