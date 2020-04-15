package com.design.strategy.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-07 10:57
 **/
public class DiscountStrategyFactory {
    private static Map<OrderType, DiscountStrategy> factory = new HashMap<>();

    static {
        factory.put(OrderType.NORMAL, new NormalDiscountStrategy());
        factory.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        factory.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        return factory.get(orderType);
    }
}
