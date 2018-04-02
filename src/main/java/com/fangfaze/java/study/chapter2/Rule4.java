package com.fangfaze.java.study.chapter2;

public class Rule4 {
    /**
     * 第四条: 通过私有构造器来强化不可实例化能力
     */

    // 不可被实例化
    // 不可继承
    //Rule4Example r4s = new Rule4Example();


}

class Rule4Example {

    /**
     * 通过私有构造器来强化不可实例化能力
     */
    private Rule4Example() {
        //该Rule4类被设置成不可实例化
        throw new AssertionError();
    }
}

//class Rule4ExampleChild extends Rule4Example{
//
//}


/**
 * 思考:
 * 效果类似于abstract和final一起用?
 * (虽然abstract和final是不能一起用的)
 */