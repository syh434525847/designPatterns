package com.design.observer.example.eventBus;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-04 16:19
 **/
public class PromotionServiceImpl implements PromotionService {
    @Override
    public void issueNewUserExperienceCash(long userId) {
        System.out.println("promotion msg : " + userId);
    }
}
