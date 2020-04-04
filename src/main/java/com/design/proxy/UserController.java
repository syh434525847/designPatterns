package com.design.proxy;

/**
 * @Description 代理模式，此时性能计数器相关代码和登陆业务无关，且在多个方法中重复，此时可以使用代理模式
 * @Author shiyuhao
 * @Date 2020-04-01 13:37
 **/
public class UserController implements IUserController {

//    public void login() {
//        // login逻辑
//
//        // 性能计数器
//
//        // 返回UserVO给前端
//    }
//
//    public void register() {
//        // register逻辑
//
//        // 性能计数器
//
//        // 返回UserVO给前端
//
//    }

    @Override
    public void login(String telephone, String password) {
        // login逻辑
        System.out.println("login");
        // 返回UserVO给前端
    }

    @Override
    public void register(String telephone, String password) {
        // register逻辑
        System.out.println("register");
        // 返回UserVO给前端
    }
}
