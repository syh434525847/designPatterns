package com.design.observer.template;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 10:14
 **/
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new LinkedList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(Message msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
