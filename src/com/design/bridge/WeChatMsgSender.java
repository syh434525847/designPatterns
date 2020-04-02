package com.design.bridge;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-01 14:28
 **/
public class WeChatMsgSender implements MsgSender {
    @Override
    public void send(String msg) {
        System.out.println("send WeChat msg :" + msg);
    }
}
