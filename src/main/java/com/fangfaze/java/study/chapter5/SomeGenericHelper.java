package com.fangfaze.java.study.chapter5;

public class SomeGenericHelper {

    public static <T extends Entity> SomeGeneric<T> make(T t) {
        return new SomeGeneric<>();
    }

    public static SomeGeneric<String> make(String message) {
        return new SomeGeneric<>();
    }
}
