package com.design.observer.example.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 11:21
 **/
public class RegNotificationObserver {

    private NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println(userId);
        notificationService.sendInboxMessage("welcome...");
    }
}
