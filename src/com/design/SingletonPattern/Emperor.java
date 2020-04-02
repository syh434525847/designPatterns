package com.design.SingletonPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description 单例模式变形，只能生成两个实例
 * @Author shiyuhao
 * @Date 2020-03-24 19:31
 **/
public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static List<String> nameList = new ArrayList<>();
    private static List<Emperor> emperorList = new ArrayList<>();
    private static int countNjumOfEmperor = 0;
    private Emperor() {
    }

    private Emperor(String name) {
        nameList.add(name);
    }

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("第" + (i + 1) + "帝"));
        }
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNjumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNjumOfEmperor);
    }

    public void say() {
        System.out.println(nameList.get(countNjumOfEmperor));
    }
}
