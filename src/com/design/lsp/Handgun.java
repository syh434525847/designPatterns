package com.design.lsp;

/**
 * @Description 手枪
 * @Author shiyuhao
 * @Date 2020-03-23 10:11
 **/
public class Handgun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("shoot handgun");
    }
}
