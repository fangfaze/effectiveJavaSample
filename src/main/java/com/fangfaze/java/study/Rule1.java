package com.fangfaze.java.study;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;

/**
 * 第一条: 用静态工厂方法代替构造器
 * 1. 有名称
 * 2. 可以不用每次创建新的对象
 * 3. 可以返回子类型的对象
 * 4. 创建参数化类型实例时,代码更简洁
 */

public class Rule1 {


    // 1. Boolean的例子
    public static void example1() {
        Boolean b = Boolean.valueOf(false);
    }


    // 2. Java Collections Framework
    // 通过静态工厂方法提供子类型
    public static void example2() {
        // TODO java.util.Collections
        Map<String, Integer> map = Collections.singletonMap("key1", 1);
    }

    // 3. EnumSet
    public static void example3() {
        EnumSet<ENUM> e = EnumSet.allOf(ENUM.class);
        System.out.println(e.getClass().toString());
        EnumSet<ENUM_BIG> e1 = EnumSet.allOf(ENUM_BIG.class);
        System.out.println(e1.getClass().toString());
    }

    enum ENUM {

    }

    enum ENUM_BIG {
        A0, A1, A2, A3, A4, A5, A6, A7, A8, A9,
        B0, B1, B2, B3, B4, B5, B6, B7, B8, B9,
        C0, C1, C2, C3, C4, C5, C6, C7, C8, C9,
        D0, D1, D2, D3, D4, D5, D6, D7, D8, D9,
        E0, E1, E2, E3, E4, E5, E6, E7, E8, E9,
        F0, F1, F2, F3, F4, F5, F6, F7, F8, F9,
        G0, G1, G2, G3, G4, G5
    }

}
