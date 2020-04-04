package com.design.factory.simpleFactory;

/**
 * @Description 简单工场模式
 * @Author shiyuhao
 * @Date 2020-04-02 16:00
 **/
public class IRuleConfigFactory {
    public static IRuleConfigParser parse(String type) {
        switch (type) {
            case "json":
                return new JsonConfigParser();
            case "xml":
                return new XmlConfigParser();
            default:
                return null;
        }
    }
}
