package com.fangfaze.java.study.chapter4;

import com.fangfaze.java.study.chaptere4.Sub;
import com.fangfaze.java.study.chaptere4.Super;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 第18条 接口优于抽象类
 */

public class Rule18Test {

    @Test
    public void testExample18() {

        Sub sub = new Sub();
        sub.look();
    }
}
