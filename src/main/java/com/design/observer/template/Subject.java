package com.design.observer.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 10:05
 **/
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notify(Message msg);
}
