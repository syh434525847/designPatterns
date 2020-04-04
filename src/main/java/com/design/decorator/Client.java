package com.design.decorator;

/**
 * @Description 装饰器模式
 * @Author shiyuhao
 * @Date 2020-04-02 14:36
 **/
public class Client {
    public static void main(String[] args) {
        IA a = new ADecorator(new A());
        a.f();
    }
}
