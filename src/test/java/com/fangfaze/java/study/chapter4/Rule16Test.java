package com.fangfaze.java.study.chapter4;

import com.fangfaze.java.study.chaptere4.InheritanceHashSet;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class Rule16Test {
    /**
     * 第16条 符合优先于继承
     */
    @Test
    public void testExample16() {
        InheritanceHashSet<String> set = new InheritanceHashSet<>();
        set.addAll(Arrays.asList("A", "B", "C"));

        System.out.println(set.getAddCount())k;


    }

}