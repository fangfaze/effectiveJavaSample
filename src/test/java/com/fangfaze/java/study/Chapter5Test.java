package com.fangfaze.java.study;

import com.fangfaze.java.study.chapter4.Complex;
import com.fangfaze.java.study.chapter4.Sub;
import com.fangfaze.java.study.chapter4.Super;
import com.fangfaze.java.study.chapter5.*;
import org.junit.Test;

import java.util.*;

public class Chapter5Test {

    /**
     * 第23条 请不要在新代码中使用原生态类型
     */

    @Test
    public void testRule23() {
        Collection collection = new HashSet();
        collection.add(12);
        collection.add(new Sub());
        collection.add(Complex.I);

        List<String> l1 = new ArrayList<>();
        unsafeAdd(l1, new Sub());
        try {
            String o = (String) unsafeGet(l1);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }
    }

    /**
     * 第24条 消除非受检警告
     */

    @Test
    public void testRule24() {
        Set<Sub> set = new HashSet();

    }

    /**
     * 第25条 列表优于数组
     */
    @Test
    public void testRule25() {
        Sub[] subs = new Sub[1];
        Super[] supers = new Super[1];
        List<Sub> subList = new ArrayList<>();
        List<Super> superList = new ArrayList<>();

        Sub sub = new Sub();
        subs[0] = sub;
        subList.add(sub);
        supers[0] = sub;
        superList.add(sub);

        List<?>[] listList = new List<?>[2];
        listList[0] = subList;
        listList[1] = superList;

    }

    /**
     * 第26条 优先考虑泛型
     */
    @Test
    public void testRule26() {
        List<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
    }

    /***
     * 第27条 优先考虑泛型方法
     */
    @Test
    public void testRule27() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = testAdd(list1, list2);

        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println(Arrays.toString(list3.toArray()));

        GenericFactory<String> genericFactory = () -> "1";
        System.out.println(genericFactory.get());

    }

    /**
     * 第28条 利用有限制通配符来提升API的灵活性
     */

    @Test
    public void testRule28() {
        MyStack<Number> numberMyStack = new MyStack<>();
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3));
        numberMyStack.pushAll(list);

        List<Object> list1 = new LinkedList<>();
        numberMyStack.popAll(list1);


    }

    /**
     * 第29条 优先考虑类型安全的异构容器
     */

    @Test
    public void testRule29() {
        Favorites favorites = new Favorites();
        favorites.put(Integer.class, 123);
        favorites.put(String.class, "123");

        Class clazz = Float.class;
//        favorites.put(clazz, "aa");

        System.out.println(favorites.get(Integer.class));
        System.out.println(favorites.get(String.class));
        System.out.println(favorites.get(clazz));
    }


    @Test
    public void testSomeGenericHelper() {
        SomeGeneric<String> someString = SomeGenericHelper.make("abc");
        SomeGeneric<Entity> someIntger = SomeGenericHelper.make(new Entity());
    }


    private <E> List<E> testAdd(final List<E> list1, final List<E> list2) {
        List<E> list = new ArrayList<>(list1);
        list.addAll(list2);
        return list;
    }


    private void unsafeAdd(List list, Object o) {
        list.add(o);

    }

    private Object unsafeGet(List<? extends Object> list) {
        return list.get(0);
    }

}
