package com.fangfaze.java.study.chapter3;

import com.fangfaze.java.study.chapter3.rule9.HashAlgorithm;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Rule9 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/07/2018</pre>
 */
public class Rule9Test {

    @Test
    public void testExample1() throws Exception {
        Rule9.example1();
    }

    @Test
    public void testExample2() throws Exception {
        HashAlgorithm ha1 = new HashAlgorithm(1, false, 1089, 1098765678L, 0.0F, "hello");
        HashAlgorithm ha2 = new HashAlgorithm(2, false, 1089, 1098765678L, -0.0F, new String("hello"));
        System.out.println(ha1.equals(ha2));
        System.out.println(ha1.hashCode());
        System.out.println(ha2.hashCode());

    }


} 
