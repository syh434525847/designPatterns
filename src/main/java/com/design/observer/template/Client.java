package com.design.observer.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 10:15
 **/
public class Client {
    public static void main(String[] args) {
        Observer observerOne = new ObserverOne();
        Observer observerTwo = new ObserverTwo();
        Subject subject = new ConcreteSubject();
        subject.registerObserver(observerOne);
        subject.registerObserver(observerTwo);

        subject.notify(new Message("123123"));
    }
}
