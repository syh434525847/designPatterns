package com.design.proxy;

/**
 * @Description 代理模式
 * @Author shiyuhao
 * @Date 2020-04-01 13:42
 **/
public class Client {
    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.login("123123", "23123");
    }
}
