package com.design.templateMethod.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-05 09:54
 **/
public abstract class AbstractClass {
    public final void template() {

        System.out.println("template method");
        method1();

        method2();
    }



    protected abstract void method1();

    protected abstract void method2();
}
