package com.fangfaze.java.study.chapter2;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Rule7 {

    /**
     * 第七条: 避免使用finalizer
     */

    // finalize防卫者, 保证finalize一定执行
    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("finalizerGuardian-finalize! Rule7");
        }
    };

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Rule7-finalize!");
    }
}
