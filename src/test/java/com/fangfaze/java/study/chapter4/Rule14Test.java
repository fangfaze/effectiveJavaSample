package com.fangfaze.java.study.chapter4;

import org.junit.Test;

import java.math.BigInteger;

public class Rule14Test {
    /**
     * 第13条 类成员可访问性最小化
     * 第14条 公有类使用访问方法而不是公有域
     */
    // 上述规则已经几乎已经是编码规约了

    /**
     * 第15条 类成员可访问性最小化
     */
    @Test
    public void testExample15() {
        BigInteger b1 = new BigInteger("1234567890");
        BigInteger b2 = new BigInteger("1234567891");

        System.out.println(b1.add(b2));
        System.out.println(b1);

        System.out.println(b1.flipBit(0));
    }

}