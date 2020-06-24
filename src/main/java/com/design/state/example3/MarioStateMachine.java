package com.design.state.example3;

/**
 * @Description 状态机
 * @Author shiyuhao
 * @Email shi.yuhao@scimall.org.cn
 * @Date 2020/6/24 1:42 下午
 **/
public class MarioStateMachine {
    private int score;
    private IMario currentSate;

    public MarioStateMachine() {
        this.score = 0;
        this.currentSate = new SmallMario(this);
    }

    public void obtainMushRoom() {
        currentSate.obtainMushRoom();
    }

    public void obtainCape() {
        currentSate.obtainCape();
    }

    public void obtainFireFlower() {
        currentSate.obtainFireFlower();
    }

    public void meetMonster() {
        currentSate.meetMonster();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public IMario getCurrentSate() {
        return currentSate;
    }

    public void setCurrentSate(IMario currentSate) {
        this.currentSate = currentSate;
    }
}
