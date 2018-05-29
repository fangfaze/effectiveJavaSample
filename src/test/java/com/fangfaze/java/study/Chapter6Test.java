package com.fangfaze.java.study;


import org.junit.Test;

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
        Color a = Color.RED;
        if (a == Color.RED) {
            System.out.println("yes");
        }
        System.out.println(a.myName());

    }


}

