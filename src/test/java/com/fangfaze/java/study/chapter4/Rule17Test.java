package com.fangfaze.java.study.chapter4;

import org.junit.Test;

/**
 * 第17条 要么为继承设计类(并提供文档),要么禁止继承
 * */

public class Rule17Test {

    @Test
    public void testExample17() {

        Sub sub = new Sub();
        sub.overrideMe();



    }
}
