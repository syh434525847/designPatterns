package com.design.isp;


import com.design.isp.correct.AbstractSearcher;
import com.design.isp.correct.IGoodBodyGirl;
import com.design.isp.correct.PrettyGirl;
import com.design.isp.correct.Searcher;

/**
 * @Description 客户端
 * @Author shiyuhao
 * @Date 2020-03-23 09:30
 **/
public class Client {
    public static void main(String[] args) {
        //NO.1
//        IPrettyGirl prettyGirl = new PrettyGirl("lili");
//        AbstractSearcher searcher = new Searcher(prettyGirl);
//        searcher.show();

        //NO.2
        IGoodBodyGirl goodBodyGirl = new PrettyGirl("lili");
        AbstractSearcher searcher = new Searcher(goodBodyGirl);

        searcher.show();
    }
}
