package telran;

import java.util.ArrayList;
import java.util.List;

public class ObservedClass implements Observable {
    private List<ObserverInterface> listOfObservers = new ArrayList<>();
    private String state;

    @Override
    public void addObserver(ObserverInterface observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (ObserverInterface observer : listOfObservers) {
        observer.handleEvent();
        }
    }

    public void stateChange(String state){
        this.state = state;
        System.out.println("For all observers: new state is - " + state);
        this.notifyObserver();
    }
}
