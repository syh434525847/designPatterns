package com.design.observer.example.sync;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-04-03 11:20
 **/
public class RegPromotionObserver implements RegObserver {

    // 依赖注入
    private PromotionService promotionService;

    public RegPromotionObserver(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
