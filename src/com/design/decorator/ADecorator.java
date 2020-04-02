package com.design.decorator;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-02 14:35
 **/
public class ADecorator implements IA {

    private IA ia;

    public ADecorator(IA ia) {
        this.ia = ia;
    }

    @Override
    public void f() {
        System.out.println("功能增强代码1");
        ia.f();
        System.out.println("功能增强代码2");
    }
}
