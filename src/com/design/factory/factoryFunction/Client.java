package com.design.factory.factoryFunction;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-02 16:14
 **/
public class Client {
    public static void main(String[] args) {
        IRuleConfigParserFactory parserFactory = RulConfigParserFactoryMap.getFactory("xml");
        IRuleConfigParser jsonParser = parserFactory.createParser();
        RuleConfig parse = jsonParser.parse();
    }
}
