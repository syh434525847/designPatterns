package com.design.observer.example.sync;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 同步阻塞的观察者模式
 * @Author shiyuhao
 * @Date 2020-04-03 11:18
 **/
public class UserController {
    private UserService userService;
    private List<RegObserver> observers = new ArrayList<>();

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void setObservers(List<RegObserver> observers) {
        this.observers.addAll(observers);
    }

    public long register(String telephone, String password) {
        long userId = userService.register(telephone, password);
        for (RegObserver observer : observers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
