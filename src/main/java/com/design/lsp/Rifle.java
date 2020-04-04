package com.design.lsp;

/**
 * @Description 步枪
 * @Author shiyuhao
 * @Date 2020-03-23 10:12
 **/
public class Rifle extends AbstractGun {

    @Override
    public void shoot() {
        System.out.println("shoot rifle");
    }
}
