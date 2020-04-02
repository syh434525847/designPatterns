package com.design.isp.wrong;

/**
 * @Description 星探类
 * @Author shiyuhao
 * @Date 2020-03-23 09:28
 **/
public class Searcher extends AbstractSearcher {

    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
    }

    @Override
    public void show() {
        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();
    }
}
