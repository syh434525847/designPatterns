package com.design.templateMethod.callback;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-05 10:28
 **/
public class BClass {
    public void process(ICallBack callBack) {
        System.out.println("Bclass's process");
        callBack.callBackMethod();
    }
}
