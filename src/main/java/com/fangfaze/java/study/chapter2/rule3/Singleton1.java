package com.fangfaze.java.study.chapter2.rule3;

import java.io.Serializable;

public class Singleton1 implements Serializable {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public void repeat(int i) {
        System.out.println("i" + i);
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
