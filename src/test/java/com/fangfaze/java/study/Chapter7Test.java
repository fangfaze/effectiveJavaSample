package com.fangfaze.java.study;

import com.fangfaze.java.study.chapter7.Period;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class Chapter7Test {

    /**
     * 第38条 检查参数的有效性
     */
    @Test
    public void rule38() throws Exception {

    }

    /**
     * 第39条 必要时进行保护性拷贝
     */
    @Test
    public void rule39() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1999);
        Date start = calendar.getTime();
        calendar.set(Calendar.YEAR, 2000);
        Date end = calendar.getTime();
        Period period = new Period(start, end);
//        end.setYear(97);
        period.getEnd().setYear(98);

        System.out.println(period.getStart().toString() + "==>" + period.getEnd().toString());
    }
}
