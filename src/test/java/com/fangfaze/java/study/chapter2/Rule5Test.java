package com.fangfaze.java.study.chapter2;

import com.fangfaze.java.study.chapter2.rule5.Person;
import com.fangfaze.java.study.chapter2.rule5.PersonInstanceUnnecessary;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Rule5 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/03/2018</pre>
 */
public class Rule5Test {

    @Test
    public void testExample1() throws Exception {
        Rule5.example1();
    }


    @Test
    public void testExample2() throws Exception {
        long start = System.currentTimeMillis();
        System.out.println("start == " + start);
        for (int i = 0; i < 10000000; ++i) {
            PersonInstanceUnnecessary person = new PersonInstanceUnnecessary();
            person.isBornIn2018();
        }
        long end = System.currentTimeMillis();
        System.out.println("end == " + end);
        System.out.println("during  == " + (end - start));

    }

    @Test
    public void testExample3() throws Exception {
        long start = System.currentTimeMillis();
        System.out.println("start == " + start);
        for (int i = 0; i < 10000000; ++i) {
            Person person = new Person();
            person.isBornIn2018();
        }
        long end = System.currentTimeMillis();
        System.out.println("end == " + end);
        System.out.println("during  == " + (end - start));

        // 避免创建对象,提升性能

    }

    @Test
    public void testExample4() throws Exception {
        Rule5.example4();
    }

    @Test
    public void testExample5() throws Exception {
        long start = System.currentTimeMillis();
        Rule5.example5();
        long end = System.currentTimeMillis();
        System.out.println("end == " + end);
        System.out.println("during  == " + (end - start));
    }

    @Test
    public void testExample6() throws Exception {
        long start = System.currentTimeMillis();
        Rule5.example6();
        long end = System.currentTimeMillis();
        System.out.println("end == " + end);
        System.out.println("during  == " + (end - start));

        // 避免创建对象,提升性能

    }
}
