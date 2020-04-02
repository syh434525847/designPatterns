package com.design.isp.correct;

/**
 * @Description 美女实现类
 * @Author shiyuhao
 * @Date 2020-03-23 09:38
 **/
public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    public PrettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + " good looking");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + " nice figure");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + " great temperament");
    }
}
