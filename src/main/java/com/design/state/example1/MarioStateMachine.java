package com.design.state.example1;

/**
 * @Description 状态机
 * @Author shiyuhao
 * @Email shi.yuhao@scimall.org.cn
 * @Date 2020/6/24 1:42 下午
 **/
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        if (this.currentState == State.SMALL) {
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }

    public void obtainCape() {
        if (this.currentState == State.SMALL || this.currentState == State.SUPER) {
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    public void obtainFireFlower() {
        if (this.currentState == State.SMALL || this.currentState == State.SUPER) {
            this.currentState = State.FIRE;
            this.score += 300;
        }
    }

    public void meetMonster() {
        if (this.currentState == State.CAPE) {
            this.score -= 200;
        }
        if (this.currentState == State.SUPER) {
            this.score -= 100;
        }
        if (this.currentState == State.FIRE) {
            this.score -= 300;
        }
        this.currentState = State.SMALL;
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
