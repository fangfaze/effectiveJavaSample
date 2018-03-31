package com.fangfaze.java.study.chapter2;

import com.alibaba.fastjson.JSONObject;
import com.fangfaze.java.study.chapter2.rule2.BuilderPattern;
import com.fangfaze.java.study.chapter2.rule2.JavaBeans;
import com.fangfaze.java.study.chapter2.rule2.MultiConstructor;

/**
 * 第二条: 多个构造函数参数是考虑用构造器
 */

public class Rule2 {
    public static void example1() {

        // 多个构造函数
        System.out.println(new MultiConstructor(1,2).toString());
        System.out.println(new MultiConstructor(1,2,1).toString());
        System.out.println(new MultiConstructor(1,2,1,99).toString());

        // Java Bean方式
        JavaBeans jb1 = new JavaBeans();
        jb1.setRequired1(10);
        jb1.setRequired2(20);
        System.out.println(jb1.toString());

        JavaBeans jb2 = new JavaBeans();
        jb2.setRequired1(10);
        jb2.setRequired2(20);
        jb2.setOptional1(10);
        System.out.println(jb2.toString());

        JavaBeans jb3 = new JavaBeans();
        jb3.setRequired1(10);
        jb3.setRequired2(20);
        jb3.setOptional1(10);
        jb3.setOptional2(999);
        System.out.println(jb3.toString());

        //Builder模式
        System.out.println(new BuilderPattern.Builder(3,4).build().toString());
        System.out.println(new BuilderPattern.Builder(3,4).optional1(100).build().toString());
        System.out.println(new BuilderPattern.Builder(3,4).optional1(100).optional2(9999).build().toString());


    }
}
