package com.design.observer.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 10:11
 **/
public class ObserverOne implements Observer {
    @Override
    public void update(Message msg) {
        System.out.println(msg.getMessage());
    }
}
