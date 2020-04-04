package com.design.observer.example.eventBus;

import com.google.common.eventbus.Subscribe;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 11:20
 **/
public class RegPromotionObserver {

    // 依赖注入
    private PromotionService promotionService;

    public RegPromotionObserver(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println(userId);
        promotionService.issueNewUserExperienceCash(userId);
    }
}
