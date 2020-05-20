package telran;

public class Observer1 implements ObserverInterface {

    @Override
    public void handleEvent() {
        System.out.println("Observer1 receive msg from ObservedClass");
    }
}
