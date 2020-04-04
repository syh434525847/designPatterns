package com.design.bridge;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-01 14:29
 **/
public abstract class Notification {
    protected MsgSender sender;

    public Notification(MsgSender sender) {
        this.sender = sender;
    }

    public abstract void notify(String msg);
}
