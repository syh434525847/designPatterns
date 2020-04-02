package com.design.factory.factoryFunction;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-02 16:10
 **/
public class XmlRuleConfigFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlConfigParser();
    }
}
