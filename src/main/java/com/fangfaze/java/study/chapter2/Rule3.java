package com.fangfaze.java.study.chapter2;

import com.fangfaze.java.study.chapter2.rule3.Singleton1;
import com.fangfaze.java.study.chapter2.rule3.Singleton2;
import com.fangfaze.java.study.chapter2.rule3.Singleton3;
import com.fangfaze.java.study.chapter2.rule3.SingletonLazy;

import java.io.*;
import java.lang.reflect.Constructor;

public class Rule3 {
    /**
     * 第三条: 用私有构造函数或枚举类型强化Singleton
     */

    public static void example1() {
        Singleton1 s1_1 = Singleton1.INSTANCE;
        Singleton1 s1_2 = Singleton1.INSTANCE;
        System.out.println(s1_1.toString() + " - " + s1_2.toString());

        Singleton2 s2_1 = Singleton2.getInstance();
        Singleton2 s2_2 = Singleton2.getInstance();
        System.out.println(s2_1.toString() + " - " + s2_2.toString());


        Singleton3 s3_1 = Singleton3.INSTANCE;
        Singleton3 s3_2 = Singleton3.INSTANCE;
        System.out.println(s3_1.getClass().getName() + "@" + Integer.toHexString(s3_1.hashCode())
                + " - " + s3_1.getClass().getName() + "@" + Integer.toHexString(s3_2.hashCode()));

    }

    // 反射
    public static void example2() throws Exception {
        Class<?> clazz1 = Singleton1.class;
        Class<?> clazz2 = Singleton2.class;
        Class<?> clazz3 = Singleton3.class;

        Constructor<?> constructor1 = clazz1.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Singleton1 s1_1 = (Singleton1) constructor1.newInstance();
        Singleton1 s1_2 = Singleton1.INSTANCE;
        System.out.println(s1_1.toString() + " - " + s1_2.toString());


        Constructor<?> constructor2 = clazz2.getDeclaredConstructor();
        constructor2.setAccessible(true);
        Singleton2 s2_1 = (Singleton2) constructor2.newInstance();
        Singleton2 s2_2 = Singleton2.getInstance();
        System.out.println(s2_1.toString() + " - " + s2_2.toString());

        try {
            Constructor<?> constructor3 = clazz3.getDeclaredConstructor();
            constructor3.setAccessible(true);
            Singleton3 s3_1 = (Singleton3) constructor3.newInstance();
            Singleton3 s3_2 = Singleton3.INSTANCE;
            System.out.println(s3_1.getClass().getName() + "@" + Integer.toHexString(s3_1.hashCode())
                    + " - " + s3_1.getClass().getName() + "@" + Integer.toHexString(s3_2.hashCode()));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    //线程安全
    public static void example3() {
        Thread[] t = new Thread[10];
        for (int i = 0; i < 10; ++i) {
            t[i] = new Thread(() -> {
                System.out.println(Singleton2.getInstance().hashCode());
            });
        }
        for (int i = 0; i < 10; ++i) {
            t[i].start();
        }
    }

    //序列化
    public static void example4() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        Singleton1 s1 = Singleton1.INSTANCE;
        oos.writeObject(s1);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton1 s2 = (Singleton1) ois.readObject();
        //判断是否是同一个对象
        file.delete();
        System.out.println(s1.toString() + " : " + s2.toString());
    }


    /**
     * 感想:
     * 1. 饿汉优先使用enum,因为可以抵御序列化问题,和反射问题
     * 2. 饿汉天然线程安全,稍微消耗资源(如可以优先采用)
     * 3. 懒汉用双check, 注意关键字volatile和synchronized
     * */
}

