package com.design.builder;

/**
 * @Description 构建器模式
 * @Author shiyuhao
 * @Date 2020-04-01 13:25
 **/
public class Client {
    public static void main(String[] args) {
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("lksdf")
                .setMaxIdle(234)
                .setMinIdle(9)
                .setMaxToal(123123)
                .build();


    }
}
