package com.design.bridge;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-01 14:32
 **/
public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender sender) {
        super(sender);
    }

    @Override
    public void notify(String msg) {
        sender.send(msg);
    }
}
