package com.design.lod;

import java.util.Random;

/**
 * @Description //TODO
 * @Author shiyuhao
 * @Date 2020-03-24 19:10
 **/
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("first...");
        return rand.nextInt(100);
    }

    private int second() {
        System.out.println("second...");
        return rand.nextInt(100);
    }

    private int third() {
        System.out.println("third...");
        return rand.nextInt(100);
    }

    public void install() {
        int first = this.first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.third();
                }
            }
        }
    }
}

class InstallSoftware {
    public void installWizard(Wizard wizard) {
        wizard.install();
    }
}
