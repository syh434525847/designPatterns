package com.design.lsp;

/**
 * @Description 机枪
 * @Author shiyuhao
 * @Date 2020-03-23 10:12
 **/
public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("shoot machine gun");
    }
}
