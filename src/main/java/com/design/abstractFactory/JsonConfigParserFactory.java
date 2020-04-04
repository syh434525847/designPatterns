package com.design.abstractFactory;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-28 18:06
 **/
public class JsonConfigParserFactory implements IConfigParserFactory{

    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return null;
    }
}
