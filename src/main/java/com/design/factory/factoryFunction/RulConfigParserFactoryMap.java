package com.design.factory.factoryFunction;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-02 16:13
 **/
public class RulConfigParserFactoryMap {
    public static Map<String, IRuleConfigParserFactory> map = new HashMap<>();

    static {
        map.put("json", new JsonRuleConfigFactory());
        map.put("xml", new XmlRuleConfigFactory());
    }

    public static IRuleConfigParserFactory getFactory(String type) {
        return map.get(type);
    }
}
