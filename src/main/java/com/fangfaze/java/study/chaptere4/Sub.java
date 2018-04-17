package com.fangfaze.java.study.chaptere4;

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

}
