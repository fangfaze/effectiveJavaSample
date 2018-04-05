package com.fangfaze.java.study.chapter2;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class Rule6 {

    /**
     * 第六条: 消除过期对象的引用
     * 常见的: 1收缩的数组,2缓存,3注册的observer
     */

    public static void examle1() {
//        MyWeakHashMap<Integer, Integer> weakHashMap = new WeakHashMap();

        SoftReference<String> sr = new SoftReference<>(new String("soft"));
        System.out.println(sr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());

        WeakReference<String> wr = new WeakReference<>(new String("weak"));
        System.out.println(wr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(wr.get());

    }


}
