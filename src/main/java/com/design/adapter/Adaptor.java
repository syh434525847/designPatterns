package com.design.adapter;

/**
 * @Description 对象适配器
 * @Author shiyuhao
 * @Date 2020-04-02 15:10
 **/
public class Adaptor implements ITarget {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        System.out.println("Adaptor f2()");
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
