package com.design.adapter;

/**
 * @Description 类适配器
 * @Author shiyuhao
 * @Date 2020-04-02 15:08
 **/
public class Adapter extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        System.out.println("adapter f2()");
    }
}
