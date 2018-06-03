package com.fangfaze.java.study;


import com.fangfaze.java.study.chapter6.Elemnet;
import com.fangfaze.java.study.chapter6.Month;
import com.fangfaze.java.study.chapter6.Weekday;
import org.junit.Test;

import java.util.*;

import static com.fangfaze.java.study.chapter6.Elemnet.木;
import static com.fangfaze.java.study.chapter6.Month.*;
import static com.fangfaze.java.study.chapter6.Weekday.*;

public class Chapter6Test {

    enum Color {
        RED(1f, 0f, 0f) {
            String myName() {
                return "#ff0000";
            }
        },
        GREEN(0f, 1f, 0f) {
            String myName() {
                return "#00ff00";
            }
        },
        BLUE(0f, 0f, 1f) {
            String myName() {
                return "#0000ff";
            }
        };

        private final float r;
        private final float g;
        private final float b;

        abstract String myName();

        Color(float r, float g, float b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    /**
     * 第30条 用enum代替int
     */
    @Test
    public void testRule30() {
        Color a = Color.valueOf("RED");
        if (a == Color.RED) {
            System.out.println("yes");
        }
        System.out.println(a.name());
        System.out.println(a.myName());


        List<Weekday> list = new ArrayList<>(Arrays.asList(WENDESDAY, MONDAY, SUNDAY, THURSDAY));
        for (Weekday weekday : list) {
            System.out.println(weekday.percent());
        }


    }

    /**
     * 第31条 用实例域代替叙述
     */
    @Test
    public void testRule31() {
        System.out.println(SEPTEMBER.daysOfMonth());
    }


    /**
     * 第32条 用EnumSet代替位域
     */

    @Test
    public void testRule32() {
        class Season {
            public int daysOfSeason() {
                return days;
            }

            private final int days;

            Season(Set<Month> months) {
                int days = 0;
                for (Month month : months) {
                    days += month.daysOfMonth();
                }
                this.days = days;
            }

        }

        Season spring = new Season(EnumSet.of(MATCH, APRIL, MAY));

        Set<Month> autumnMonths = new HashSet<>(Arrays.asList(SEPTEMBER, OCTOBER, NOVEMBER));

        System.out.println(spring.daysOfSeason());
        System.out.println(new Season(autumnMonths).daysOfSeason());
    }

    /**
     * 第33条 用EnumMap代替序数索引
     */
    @Test
    public void testRule33() {
        Map<Month, Integer> map = new EnumMap<>(Month.class);
        for (Month month : Month.values()) {
            map.put(month, month.daysOfMonth());
        }
        map.forEach((k, v) -> System.out.println(v));


        System.out.println(Elemnet.mix(Elemnet.木,Elemnet.目));
        System.out.println(Elemnet.mix(Elemnet.木,Elemnet.木));
        System.out.println(Elemnet.mix(Elemnet.木,Elemnet.水));

    }



}

