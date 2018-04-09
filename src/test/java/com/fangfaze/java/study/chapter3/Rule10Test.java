package com.fangfaze.java.study.chapter3;

import com.fangfaze.java.study.chapter3.rule9.HashAlgorithm;
import com.fangfaze.java.study.chapter3.rule9.PhoneNumber;
import org.junit.Test;

/**
 * Rule10 Tester.
 *
 */
public class Rule10Test {

    @Test
    public void testExample1() throws Exception {
        PhoneNumber phoneNumber = new PhoneNumber(1, "13333333333");
        System.out.println(phoneNumber);
        System.out.println("what?" + phoneNumber);
    }


} 
