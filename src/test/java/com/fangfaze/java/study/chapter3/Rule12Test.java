package com.fangfaze.java.study.chapter3;

import com.fangfaze.java.study.chapter2.rule6.StackMemoryLeak;
import com.fangfaze.java.study.chapter3.rule9.PhoneNumber;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 第11条 谨慎的重写clone
 */
public class Rule12Test {

    @Test
    public void testExample1() throws Exception {
        TreeSet<PhoneNumber> treeSet = new TreeSet<>();

        treeSet.add(new PhoneNumber(1, "13333333331"));
        treeSet.add(new PhoneNumber(8, "13333333332"));
        treeSet.add(new PhoneNumber(3, "13333333333"));
        treeSet.add(new PhoneNumber(6, "13333333334"));
        treeSet.add(new PhoneNumber(2, "13333333335"));

        System.out.println("what?" + treeSet);
    }

    @Test
    public void testExample2() throws Exception {
        PhoneNumber[] phoneNumbers = {
                new PhoneNumber(2, "13333333332"),
                new PhoneNumber(1, "13333333336"),
                new PhoneNumber(4, "13333333334"),
                new PhoneNumber(1, "13333333331"),
                new PhoneNumber(5, "13333333335"),
                new PhoneNumber(3, "13333333333"),
        };
        Arrays.sort(phoneNumbers);
        System.out.println(Arrays.toString(phoneNumbers));
    }
}
