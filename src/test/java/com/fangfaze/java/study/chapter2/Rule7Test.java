package com.fangfaze.java.study.chapter2;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Rule7 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/05/2018</pre>
 */
public class Rule7Test {
    @Test
    public void testExamle1() throws Exception {
        Rule7 rule7 = new Rule7();
        rule7 = null;
        System.gc();
    }

    @Test
    public void test() throws Exception {
        class Rule7Child extends Rule7 {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Rule7Child-finalize");
            }
        }
        Rule7Child rule7Child = new Rule7Child();
        rule7Child = null;
        System.gc();


    }
}
