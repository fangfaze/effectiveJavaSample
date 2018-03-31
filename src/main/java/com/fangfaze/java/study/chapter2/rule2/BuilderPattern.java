package com.fangfaze.java.study.chapter2.rule2;

public class BuilderPattern {
    private final int required1;
    private final int required2;
    private final int optional1;
    private final int optional2;

    private BuilderPattern(Builder builder) {
        this.required1 = builder.required1;
        this.required2 = builder.required2;
        this.optional1 = builder.optional1;
        this.optional2 = builder.optional2;
    }

    public static class Builder {
        private final int required1;
        private final int required2;
        private int optional1 = 0;
        private int optional2 = 100;

        public Builder(int required1, int required2) {
            this.required1 = required1;
            this.required2 = required2;
        }

        public Builder optional1(int optional1) {
            this.optional1 = optional1;
            return this;
        }

        public Builder optional2(int optional2) {
            this.optional2 = optional2;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    @Override
    public String toString() {
        return "required1 = " + required1
                + "; required2 = " + required2
                + "; optional1 = " + optional1
                + "; optional2 = " + optional2;
    }
}
