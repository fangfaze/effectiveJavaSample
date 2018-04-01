package com.fangfaze.java.study.chapter2.rule3;

import java.io.Serializable;

public class Singleton2 implements Serializable {
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public void repeat(int i) {
        System.out.println("i" + i);
    }


}
