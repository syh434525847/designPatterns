package com.design.strategy.template;

/**
 * @Description 策略模式接口
 * @Author shiyuhao
 * @Date 2020-04-07 10:55
 **/
public interface DiscountStrategy {
    double calDiscount(Order order);
}
