package com.design.factory;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-28 17:19
 **/
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
