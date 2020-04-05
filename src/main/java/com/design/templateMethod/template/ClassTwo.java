package com.design.templateMethod.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-05 10:00
 **/
public class ClassTwo extends AbstractClass {
    @Override
    protected void method2() {
        System.out.println("classTwo method2");
    }

    @Override
    protected void method1() {
        System.out.println("classTwo method1");
    }
}
