package com.fangfaze.java.study.chapter2.rule4;

public class Rule4Example {
    /**
     * 通过私有构造器来强化不可实例化能力
     */
    private Rule4Example() {
        //该Rule4类被设置成不可实例化
        throw new AssertionError();
    }

    public static void hello() {
        System.out.println("hello");
    }
}
