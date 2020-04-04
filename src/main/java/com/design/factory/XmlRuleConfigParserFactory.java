package com.design.factory;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-28 17:23
 **/
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
