package com.design.lod;

import java.util.List;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-24 18:58
 **/
public class GroupLeader {

    private List<Girl> girlLis;

    public GroupLeader(List<Girl> girlLis) {
        this.girlLis = girlLis;
    }

    public void countGirls() {
        System.out.println("女生数量为" + this.girlLis.size());
    }
}
