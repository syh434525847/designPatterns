package com.design.templateMethod.template;

/**
 * @Description 模版方法模式
 * @Author shiyuhao
 * @Date 2020-04-05 10:01
 **/
public class Client {
    public static void main(String[] args) {
        AbstractClass classOne = new ClassOne();
        classOne.template();
    }
}
