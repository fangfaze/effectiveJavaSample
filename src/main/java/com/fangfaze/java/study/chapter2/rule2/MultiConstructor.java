package com.fangfaze.java.study.chapter2.rule2;

public class MultiConstructor {
    private final int required1;
    private final int required2;
    private final int optional1;
    private final int optional2;

    public MultiConstructor(int requried1, int requried2) {
        this(requried1, requried2, 0);
    }

    public MultiConstructor(int requried1, int requried2, int optional1) {
        this(requried1, requried2, optional1, 100);
    }

    public MultiConstructor(int requried1, int requried2, int optional1, int optional2) {
        this.required1 = requried1;
        this.required2 = requried2;
        this.optional1 = optional1;
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
