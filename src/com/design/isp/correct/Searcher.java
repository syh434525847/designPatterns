package com.design.isp.correct;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-23 09:40
 **/
public class Searcher extends AbstractSearcher {
    public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
        super(greatTemperamentGirl);
    }

    public Searcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下--------------");
        if (super.goodBodyGirl != null) {
            super.goodBodyGirl.goodLooking();
            super.goodBodyGirl.niceFigure();
        }
        if (super.greatTemperamentGirl != null) {
            super.greatTemperamentGirl.greatTemperament();
        }
    }
}
