package com.fangfaze.java.study.chapter3;

import com.fangfaze.java.study.chapter3.rule9.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class Rule9 {
    /**
     * 第九条: 重写equals时必须同时重写hashCode
     */

    public static void example1() {
        PhoneNumber p1 = new PhoneNumber(1, "1300000001");
        PhoneNumber p2 = new PhoneNumber(2, "1300000001");

        System.out.println(p1.equals(p2));

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(p1, "Tom");

        System.out.println(map.get(p2));

    }


}
