package com.design.bridge;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-01 14:33
 **/
public class Client {
    public static void main(String[] args) {
        MsgSender sender = new WeChatMsgSender();
        Notification notification = new SevereNotification(sender);
        notification.notify("123123");
    }
}
