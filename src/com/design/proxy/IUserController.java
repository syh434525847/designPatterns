package com.design.proxy;

/**
 * @Auther: shiyuhao
 * @Date: 2020-04-01 13:49
 * @Description:
 */
public interface IUserController {
    void login(String telephone, String password);

    void register(String telephone, String password);
}
