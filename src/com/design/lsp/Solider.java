package com.design.lsp;

/**
 * @Description 士兵
 * @Author shiyuhao
 * @Date 2020-03-23 10:13
 **/
public class Solider {

    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        this.gun.shoot();
    }
}
