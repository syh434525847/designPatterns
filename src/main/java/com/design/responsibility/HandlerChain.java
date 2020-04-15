package com.design.responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-07 14:33
 **/
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (!handled) {
                break;
            }
        }
    }
}
