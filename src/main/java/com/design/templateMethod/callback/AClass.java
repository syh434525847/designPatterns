package com.design.templateMethod.callback;

/**
 * @Description 回调函数，也符合模版模式
 * @Author shiyuhao
 * @Date 2020-04-05 10:28
 **/
public class AClass {
    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(()-> {
            System.out.println("callBack method");
        });
    }
}
