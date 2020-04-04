package com.design.observer.example.eventBus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @Description EventBus 实现异步非阻塞观察者模式
 * @Author shiyuhao
 * @Date 2020-04-03 11:18
 **/
public class UserController {
    //依赖注入
    private UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        this.userService = new UserServiceImpl();
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }
    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            this.eventBus.register(observer);
        }
    }
    public long register(String telephone, String password) {
        Long userId = userService.register(telephone, password);
        eventBus.post(userId);
        return userId;
    }
}
