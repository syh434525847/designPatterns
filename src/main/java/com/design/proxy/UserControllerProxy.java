package com.design.proxy;

/**
 * @Description 继承需要扩展的类，然后重写方法
 * @Author shiyuhao
 * @Date 2020-04-01 13:41
 **/
public class UserControllerProxy extends UserControllerNew {

    @Override
    public void login() {
        // login逻辑

        // 性能计数器

        // 返回UserVO给前端
    }

    @Override
    public void register() {
        // register逻辑

        // 性能计数器

        // 返回UserVO给前端
    }
}
