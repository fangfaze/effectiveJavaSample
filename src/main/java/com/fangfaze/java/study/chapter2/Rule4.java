package com.fangfaze.java.study.chapter2;


import com.fangfaze.java.study.chapter2.rule4.Rule4Example;

//public class Rule4 extends Rule4Example {
public class Rule4 {
    /**
     * 第四条: 通过私有构造器来强化不可实例化能力
     */
    // 不可被实例化
    // 不可继承
    //Rule4Example r4s = new Rule4Example();
    public static void example1() {
//        Rule4Example rule4Example = new Rule4Example();
        Rule4Example.hello();
    }
}

//class Rule4ExampleChild{
//
//}

/**
 * 思考:
 * 效果类似于abstract和final一起用?
 * (虽然abstract和final是不能一起用的)
 */
