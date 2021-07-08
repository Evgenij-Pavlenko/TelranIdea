package com.company;


public interface Observer {

    void addObserver(ObserverImpl observerInt);

    void removeObserver(ObserverImpl observerInt);

    void notifyObserver(String number);
}
