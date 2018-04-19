package com.fangfaze.java.study.chapter4;

import com.fangfaze.java.study.chaptere4.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 第18条 接口优于抽象类
 * 第19条 接口只用来定义类型(而不要用来定义常亮)
 */

public class Rule18Test {

    @Test
    public void testExample18() {

        Sub sub = new Sub();
        sub.look();
    }


    /**
     * 第20条 层级结构优于标签类
     */
    @Test
    public void testExample20() {

        System.out.println(new Circle(14.4d).area());
        System.out.println(new Rectangle(14.4d, 92d).area());

    }

    /**
     * 第21条 用函数对象表示策略
     * (个人理解:有函数对象 实现 策略模式)
     */

    @Test
    public void textExaple21() {
        String[] list = {"aa", "b", "aaa"};
        Arrays.sort(list, StringComparator.COMPARATOR);
        System.out.println(Arrays.toString(list));
    }

}
