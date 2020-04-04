package com.design.observer.example.async;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Description 异步非阻塞的观察者模式
 * @Author shiyuhao
 * @Date 2020-04-03 11:18
 **/
public class UserController {
    private UserService userService;
    private List<RegObserver> observers = new ArrayList<>();
    private Executor executor;

    public UserController(UserService userService) {
        this.userService = userService;
        this.executor = Executors.newFixedThreadPool(2);
    }

    public void setObservers(List<RegObserver> observers) {
        this.observers.addAll(observers);
    }

    public long register(String telephone, String password) {
        long userId = userService.register(telephone, password);
        for (RegObserver observer : observers) {
            executor.execute(() -> {
                observer.handleRegSuccess(userId);
            });
        }
        return userId;
    }
}
