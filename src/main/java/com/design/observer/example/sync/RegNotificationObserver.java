package com.design.observer.example.sync;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 11:21
 **/
public class RegNotificationObserver implements RegObserver {

    private NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage("welcome...");
    }
}
