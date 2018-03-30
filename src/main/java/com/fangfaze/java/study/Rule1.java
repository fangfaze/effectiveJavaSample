package com.fangfaze.java.study;

import com.fangfaze.java.study.rule1_3.ENUM;
import com.fangfaze.java.study.rule1_3.ENUM_BIG;
import com.fangfaze.java.study.rule1_4.Service;
import com.fangfaze.java.study.rule1_4.Services;

import java.util.*;

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

    // 4. 服务提供者框架
    public static void example4() {

        Services.registerDefaultProvider(() -> (() -> "defService"));
        Services.registerProvider("my", () -> (() -> "myService"));

        try {
            Service s = Services.newInstance();
            System.out.println(s.getName());
            Service s1 = Services.newInstance("my");
            System.out.println(s1.getName());
            Service s2 = Services.newInstance("your");
            System.out.println(s2.getName());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    // 5. 类型推导
    public static void example5(){
        // 1.8 已经可以了
        Map<String, List<String>> listMap = new HashMap<>();

    }

    // 6. 不含有public构造器,就不能子类化
    public static void example6(){

    }


}
