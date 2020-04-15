package com.design.strategy.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-07 10:56
 **/
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
