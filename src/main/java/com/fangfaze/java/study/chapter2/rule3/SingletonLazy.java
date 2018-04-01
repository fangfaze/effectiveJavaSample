package com.fangfaze.java.study.chapter2.rule3;

public class SingletonLazy {
    private static volatile SingletonLazy INSTANCE = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }
}
