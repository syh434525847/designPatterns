package com.design.observer.example.eventBus;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-04 16:19
 **/
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendInboxMessage(String msg) {
        System.out.println("send msg:" + msg);
    }
}
