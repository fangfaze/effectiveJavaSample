package com.fangfaze.java.study.chapter4;

import jdk.internal.dynalink.beans.StaticClass;

public class OuterClass {
    private final int id;

    public final static InnerClass1 i1 = new InnerClass1();
    public final InnerClass2 i2 = new InnerClass2();

    public OuterClass(int id) {
        this.id = id;
    }

    static class InnerClass1 {
        public void call() {
            System.out.println("I1" + this.getClass().getName());
        }
    }

    class InnerClass2 {
        public void call() {
            System.out.println("I2" + this.getClass().getName() + "+" + id);
        }
    }

    public void call() {

        class InnerCLass3 {
            int id = 999;
            public void call() {
                System.out.println("I3" + this.getClass().getName() + id);
            }
        }
        new InnerCLass3().call();
        System.out.println(this.getClass().getName() + "+" + id);

    }


}
