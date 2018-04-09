package com.fangfaze.java.study.chapter3;

import com.fangfaze.java.study.chapter2.rule6.StackMemoryLeak;
import com.fangfaze.java.study.chapter3.rule9.PhoneNumber;
import org.junit.Test;

import java.util.*;

/**
 * 第11条 谨慎的重写clone
 */
public class Rule11Test {

    @Test
    public void testExample1() throws Exception {
        PhoneNumber phoneNumber = new PhoneNumber(1, "13333333333");
        PhoneNumber clone = phoneNumber.clone();
        System.out.println("what?" + clone);
    }

    @Test
    public void testExample2() throws Exception {
        StackMemoryLeak stackMemoryLeak = new StackMemoryLeak();
        stackMemoryLeak.push("1");
        stackMemoryLeak.push("2");
        stackMemoryLeak.push("3");
        stackMemoryLeak.push("4");
        StackMemoryLeak stackClone = stackMemoryLeak.clone();

        System.out.println(stackMemoryLeak.pop());
        System.out.println(stackMemoryLeak.pop());
        System.out.println(stackClone.pop());
    }

    @Test
    public void testExample3() throws Exception {
        Set<String> map = new HashSet<>();
        map.add("a");
        map.add("b");
        // todo 用拷贝工厂实现HashSet转换TreeSet

    }
} 
