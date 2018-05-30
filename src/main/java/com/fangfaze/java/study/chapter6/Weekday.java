package com.fangfaze.java.study.chapter6;

public enum Weekday {
    MONDAY(DayType.NORMAL),
    TUESDAY(DayType.NORMAL),
    WENDESDAY(DayType.NORMAL),
    THURSDAY(DayType.NORMAL),
    FRIDAY(DayType.NORMAL),
    SATURDAY(DayType.VACATION),
    SUNDAY(DayType.VACATION);

    private final DayType dayType;

    public int percent() {
        return dayType.percent();
    }

    Weekday(DayType dayType) {
        this.dayType = dayType;
    }

    private enum DayType {
        NORMAL {
            int percent() {
                return 20;
            }
        },
        VACATION {
            int percent() {
                return 100;
            }
        };

        abstract int percent();

    }
}
