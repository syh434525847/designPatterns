package com.design.templateMethod.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-05 09:59
 **/
public class ClassOne extends AbstractClass {
    @Override
    protected void method2() {
        System.out.println("classone method2");
    }

    @Override
    protected void method1() {
        System.out.println("classone method1");
    }
}
