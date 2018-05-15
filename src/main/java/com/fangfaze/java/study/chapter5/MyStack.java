package com.fangfaze.java.study.chapter5;

import java.util.Collection;
import java.util.Stack;

public class MyStack<E> {

    private Stack<E> stack;

    public MyStack() {
        stack = new Stack<>();
    }

    public void push(E e) {
        stack.push(e);
    }

    public E pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

}
