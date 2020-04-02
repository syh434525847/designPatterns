package com.design.lsp;

import java.util.Collection;
import java.util.Map;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-23 20:15
 **/
public class Child extends Father {
    @Override
    public Collection convert(Map map) {
        System.out.println("child");
        return map.values();
    }
}
