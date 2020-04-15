package com.design.responsibility;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-07 14:34
 **/
public class Client {
    public static void main(String[] args) {
        IHandler handlerA = new HandlerA();
        IHandler handlerB = new HandlerB();
        HandlerChain chain = new HandlerChain();
        chain.addHandler(handlerA);
        chain.addHandler(handlerB);

        chain.handle();
    }
}
