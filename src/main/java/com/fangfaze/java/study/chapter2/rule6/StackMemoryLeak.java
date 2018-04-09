package com.fangfaze.java.study.chapter2.rule6;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMemoryLeak implements Cloneable {
    // 存在内存不能及时释放的情况(内存不能及时有效利用内存泄露),但是不能算是严格意义上的内存永久泄露

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackMemoryLeak() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        elements[size] = null;
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    @Override
    public StackMemoryLeak clone() {
        try {
            return (StackMemoryLeak) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
