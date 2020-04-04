package com.design.factory.factoryFunction;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-02 16:06
 **/
public class JsonRuleConfigFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonConfigParser();
    }
}
