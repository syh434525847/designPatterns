package com.design.lsp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-23 10:14
 **/
public class Client {
    public static void main(String[] args) {

        Child father = new Child();
        Collection collection = father.convert(new HashMap(){{
            put("111", "222");
            put("222", "333");
        }});
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        AbstractGun handGun = new Handgun();
//        Solider solider = new Solider();
//        /**
//         * 此时传入的是手枪，其实已经违反了lsp原则
//         */
//        solider.setGun(handGun);
//        solider.killEnemy();
    }
}
