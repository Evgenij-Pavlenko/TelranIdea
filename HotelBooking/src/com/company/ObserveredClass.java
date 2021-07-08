package com.company;

import java.util.ArrayList;
import java.util.List;

public class ObserveredClass implements Observer {
    private List<ObserverImpl> observerList = new ArrayList<>();
    private String number;

    public ObserveredClass() {
    }

    public void setRoomsNumber(Room room) {
        this.number = room.getNumber();
        System.out.println("Cleaning for room: " + number);
        this.notifyObserver(number);
    }

    @Override
    public void addObserver(ObserverImpl observerInt) {
        observerList.add(observerInt);

    }

    @Override
    public void removeObserver(ObserverImpl observerInt) {
        observerList.remove(observerInt);
    }

    @Override
    public void notifyObserver(String number) {
        for (ObserverImpl o : observerList) {
            o.handlerEvent(number);
        }
    }
}
