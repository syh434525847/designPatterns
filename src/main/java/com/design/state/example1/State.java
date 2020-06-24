package com.design.state.example1;

/**
 * @Description 马里奥状态，对应状态机的状态
 * @Author shiyuhao
 * @Date 2020/6/24 1:43 下午
 **/
public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }
}
