package com.design.observer.example.eventBus;

import java.util.Arrays;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-04 16:16
 **/
public class Client {
    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.setRegObservers(Arrays.asList(new RegNotificationObserver(new NotificationServiceImpl()),new RegPromotionObserver(new PromotionServiceImpl())));
        controller.register("1231231", "123123");
    }
}
