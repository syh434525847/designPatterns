package com.design.SingletonPattern;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-24 19:58
 **/
public class Minister {
    public static void main(String[] args) {
        int minister = 5;
        for (int i = 0; i < 5; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是");
            emperor.say();
        }
    }
}
