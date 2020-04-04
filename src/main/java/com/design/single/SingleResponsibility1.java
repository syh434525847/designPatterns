package com.design.single;

/**
 * @Description 单一职责原则
 * @Author shiyuhao
 * @Date 2020-03-20 11:49
 **/
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("小汽车");
        vehicle.run("公交");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类，此时违反了单一原则
 */
class Vehicle {
    public void run(String name) {
        System.out.printf("%s 在跑。。。 \n", name);
    }
}
