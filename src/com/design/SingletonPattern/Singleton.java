package com.design.SingletonPattern;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-24 19:38
 **/
public class Singleton {
    private static class Single {
        private static final Singleton instance = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return Single.instance;
    }
}
