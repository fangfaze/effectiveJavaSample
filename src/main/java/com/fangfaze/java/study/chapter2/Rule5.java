package com.fangfaze.java.study.chapter2;

import java.util.HashMap;
import java.util.Map;

public class Rule5 {
    /**
     * 第五条: 避免创建不必要的对象
     */

    public static void example1() {
        // bad
        String s1 = new String("string");
        String s2 = new String("string");

        //每次创建了不同的对象
        System.out.println(s1.hashCode() + " - " + s2.hashCode());
        System.out.println(s1 == s2);

        String s3 = "string";
        String s4 = "string";

        //同一个实例
        System.out.println(s3.hashCode() + " - " + s4.hashCode());
        System.out.println(s3 == s4);
    }

    public static void example4() {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(map.keySet());
        map.put(1, 1);
        System.out.println(map.keySet());
        map.put(2, 2);
        System.out.println(map.keySet());
        map.put(3, 3);
        System.out.println(map.keySet());
        // todo Map.keyset的原理有待进一步学习
    }

    public static void example5() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void example6() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * 注意: 不是所有的情况一定要避免创建对象,
     * 小对象的创建和回收比较廉价,可以提升程序清晰性,简洁性和功能性时,通常是好事
     * 重用对象的代价远远大于创建重复对象时, 要创建重复对象.
     *
     * 具体问题具体分析, 不可过于偏颇
     * */

}
