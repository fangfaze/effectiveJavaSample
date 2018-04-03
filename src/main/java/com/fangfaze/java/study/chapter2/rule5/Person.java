package com.fangfaze.java.study.chapter2.rule5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// BAD
public class Person {
    private final Date birthday = new Date();

    private static final Date START;
    private static final Date END;

    static {
        Calendar gmtCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCalendar.set(2018, Calendar.JANUARY, 1, 0, 0, 0);
        START = gmtCalendar.getTime();
        gmtCalendar.set(2019, Calendar.JANUARY, 1, 0, 0, 0);
        END = gmtCalendar.getTime();

    }

    public boolean isBornIn2018() {
        return birthday.compareTo(START) >= 0 && birthday.compareTo(END) < 0;
    }

}
