package com.design.bridge;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-01 14:30
 **/
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender sender) {
        super(sender);
    }

    @Override
    public void notify(String msg) {
        sender.send(msg);
    }
}
