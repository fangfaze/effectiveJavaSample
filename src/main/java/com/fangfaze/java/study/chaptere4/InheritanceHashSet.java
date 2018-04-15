package com.fangfaze.java.study.chaptere4;

import java.util.Collection;
import java.util.HashSet;

public class InheritanceHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InheritanceHashSet() {
    }

    public InheritanceHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}
