package com.fangfaze.java.study.chapter4;

import org.junit.Test;

import java.util.Arrays;

public class Rule16Test {
    /**
     * 第16条 复合优先于继承
     */

    @Test
    public void testExample16() {
        InheritanceHashSet<String> set1 = new InheritanceHashSet<>();
        set1.addAll(Arrays.asList("A", "B", "C"));
        System.out.println(set1.getAddCount());

        CompositionHashSet<String> set2 = new CompositionHashSet<>();
        set2.addAll(Arrays.asList("A", "B", "C"));
        System.out.println(set2.getAddCount());



    }

}