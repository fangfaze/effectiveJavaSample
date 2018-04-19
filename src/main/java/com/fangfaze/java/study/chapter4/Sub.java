package com.fangfaze.java.study.chapter4;

import java.util.Date;

public class Sub extends Super {
    private final Date date;

    public Sub() {
        date = new Date();
    }

    @Override
    public void overrideMe() {
        System.out.println(date);
    }

    @Override
    public void look() {
        System.out.println("(sub)look out!");
    }
}
