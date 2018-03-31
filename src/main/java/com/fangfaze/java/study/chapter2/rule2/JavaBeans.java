package com.fangfaze.java.study.chapter2.rule2;

public class JavaBeans {
    private int required1 = -1; // Required
    private int required2 = -1;// Required
    private int optional1 = 0;
    private int optional2 = 100;

    public JavaBeans() {
    }

    public int getRequired1() {
        return required1;
    }

    public void setRequired1(int required1) {
        this.required1 = required1;
    }

    public int getRequired2() {
        return required2;
    }

    public void setRequired2(int required2) {
        this.required2 = required2;
    }

    public int getOptional1() {
        return optional1;
    }

    public void setOptional1(int optional1) {
        this.optional1 = optional1;
    }

    public int getOptional2() {
        return optional2;
    }

    public void setOptional2(int optional2) {
        this.optional2 = optional2;
    }

    @Override
    public String toString() {
        return "required1 = " + required1
                + "; required2 = " + required2
                + "; optional1 = " + optional1
                + "; optional2 = " + optional2;
    }

}
