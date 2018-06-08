package com.fangfaze.java.study.chapter6;

public enum Month implements Somedays{
    JANUARY(31),
    FEBRUARY(28),
    MATCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    final private int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }


}
