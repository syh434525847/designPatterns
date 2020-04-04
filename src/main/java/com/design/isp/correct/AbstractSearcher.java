package com.design.isp.correct;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-23 09:39
 **/
public abstract class AbstractSearcher {

    protected IGreatTemperamentGirl greatTemperamentGirl;
    protected IGoodBodyGirl goodBodyGirl;

    public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
        this.greatTemperamentGirl = greatTemperamentGirl;
    }

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
        this.goodBodyGirl = goodBodyGirl;
    }

    public abstract void show();
}
