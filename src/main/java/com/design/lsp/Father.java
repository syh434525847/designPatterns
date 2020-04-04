package com.design.lsp;

import java.util.Collection;
import java.util.Map;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-23 10:30
 **/
public class Father {
    public Collection convert(Map map) {
        System.out.println("father");
        return map.values();
    }
}
