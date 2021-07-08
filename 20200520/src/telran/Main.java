package telran;

public class Main {

    public static void main(String[] args) {
    ObservedClass observedClass = new ObservedClass();

    Observer1 o1 = new Observer1();
    Observer2 o2 = new Observer2();

    observedClass.addObserver(o1);
    observedClass.addObserver(o2);

    observedClass.stateChange("start");
//    observedClass.notifyObserver();
        System.out.println("------------------------");
        observedClass.stateChange("finish");
    }
}
