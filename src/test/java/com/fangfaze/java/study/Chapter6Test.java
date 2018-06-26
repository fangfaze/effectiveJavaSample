package com.fangfaze.java.study;


import com.fangfaze.java.study.chapter6.*;
import org.junit.Test;

import java.util.*;

import static com.fangfaze.java.study.chapter6.Month.*;
import static com.fangfaze.java.study.chapter6.Weekday.*;

@MyAtInterface
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
        System.out.println(SEPTEMBER.getDays());
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
                    days += month.getDays();
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
            map.put(month, month.getDays());
        }
        map.forEach((k, v) -> System.out.println(v));


        System.out.println(Elemnet.mix(Elemnet.木, Elemnet.目));
        System.out.println(Elemnet.mix(Elemnet.木, Elemnet.木));
        System.out.println(Elemnet.mix(Elemnet.木, Elemnet.水));

    }

    /**
     * 第34条 用接口模拟可伸缩的枚举
     */

    @Test
    public void testRule34() {
        showDays(Month.class);
        showDays(Season.class);

        showDays1(Month.values());
        showDays1(Season.values());

    }

    private <T extends Enum<T> & Somedays> void showDays(Class<T> clazz) {
        for (Somedays somedays : clazz.getEnumConstants()) {
            System.out.println(somedays.toString() + ":" + somedays.getDays());
        }

    }

    private <T extends Somedays> void showDays1(T[] list) {
        for (Somedays somedays : list) {
            System.out.println(somedays.toString() + ":" + somedays.getDays());
        }

    }

    /**
     * 第35条 注解优先于命名方式
     */

    @Test
    public void testRule35() {
        Class<?> clazz = this.getClass();
        if(clazz.isAnnotationPresent(MyAtInterface.class)){
            System.out.println("Annotation class!");
        }

    }
    /**
     * 第36条 坚持使用@Override
     */

    @Test
    public void testRule36() {

    }

    /**
     * 第37条 用标记接口定义类型
     */

    @Test
    public void testRule37() {

    }




}

