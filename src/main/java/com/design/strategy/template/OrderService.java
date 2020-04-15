package com.design.strategy.template;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-07 11:01
 **/
public class OrderService {

    public static void main(String[] args) {
        Order order = new Order();
        order.setType(OrderType.NORMAL);
        System.out.println(discount(order));
    }

    public static double discount(Order order) {
        OrderType orderType = order.getType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(orderType);
        double count = discountStrategy.calDiscount(order);
        return count;
    }
}
