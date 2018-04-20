package com.fangfaze.java.study;

import com.fangfaze.java.study.chapter4.Complex;
import com.fangfaze.java.study.chapter4.Sub;
import org.junit.Test;

import java.util.*;

public class Chapter5Test {

    /**
     * 第23条 请不要在新代码中使用原生态类型
     */

    @Test
    public void testRule23() {
        Collection collection = new HashSet();
        collection.add(12);
        collection.add(new Sub());
        collection.add(Complex.I);

        List<String> l1 = new ArrayList<>();
        unsafeAdd(l1, new Sub());
        String o = (String) unsafeGet(l1);


    }

    private void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    private Object unsafeGet(List<? extends Object> list) {
        return list.get(0);
    }

}
