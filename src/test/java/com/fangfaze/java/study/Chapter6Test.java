package com.fangfaze.java.study;


import com.fangfaze.java.study.chapter6.Weekday;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


}

