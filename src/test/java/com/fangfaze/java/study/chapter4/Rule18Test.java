package com.fangfaze.java.study.chapter4;

import com.fangfaze.java.study.chaptere4.Circle;
import com.fangfaze.java.study.chaptere4.Rectangle;
import com.fangfaze.java.study.chaptere4.Sub;
import com.fangfaze.java.study.chaptere4.Super;
import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    public void testExample19() {

        System.out.println(new Circle(14.4d).area());
        System.out.println(new Rectangle(14.4d, 92d).area());

    }
}
