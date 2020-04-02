package com.design.isp.wrong;

/**
 * @Description 星探抽象类
 * @Author shiyuhao
 * @Date 2020-03-23 09:27
 **/
public abstract class AbstractSearcher {
    protected IPrettyGirl prettyGirl;

    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }

    public abstract void show();
}
