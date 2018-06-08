package com.fangfaze.java.study.chapter6;

import static com.fangfaze.java.study.chapter6.Month.*;

public enum Season implements Somedays {
    SPRING(MATCH, APRIL, MAY),
    SUMMER(JUNE, JULY, AUGUST),
    ALTUMN(SEPTEMBER, OCTOBER, NOVEMBER),
    WINTER(DECEMBER, JANUARY, FEBRUARY);

    private int days;

    Season(Month... months) {
        int days = 0;
        for (Month month : months) {
            days += month.getDays();
        }
        this.days = days;
    }

    @Override
    public int getDays() {
        return days;
    }

}
