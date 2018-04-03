package com.fangfaze.java.study.chapter2.rule5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// BAD
public class PersonInstanceUnnecessary {
    private final Date birthday = new Date();

    // don't do this
    public boolean isBornIn2018() {
        Calendar gmtCalendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCalendar.set(2018, Calendar.JANUARY, 1, 0, 0, 0);
        final Date start = gmtCalendar.getTime();
        gmtCalendar.set(2019, Calendar.JANUARY, 1, 0, 0, 0);
        final Date end = gmtCalendar.getTime();

        return birthday.compareTo(start) >= 0 && birthday.compareTo(end) < 0;
    }

}
