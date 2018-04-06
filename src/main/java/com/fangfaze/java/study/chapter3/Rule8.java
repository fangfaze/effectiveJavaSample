package com.fangfaze.java.study.chapter3;

import com.fangfaze.java.study.chapter3.rule8.CaseInsensitiveString;
import com.fangfaze.java.study.chapter3.rule8.ColorPoint;
import com.fangfaze.java.study.chapter3.rule8.CombinationColorPoint;
import com.fangfaze.java.study.chapter3.rule8.Point;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Rule8 {
    /**
     * 重写equals的的约定
     * 1. 应该避免重写equals.
     * 2. 重写equals方法时,需要注意:自反性,对称性,传递性,一致性.非null性.
     * <p>
     * 重写equals方法时,要同时重写hashCode
     *
     * @Override通常是个避免错误的好方法
     */

    // 非对称的例子
    public static void example1() {
        CaseInsensitiveString s1 = new CaseInsensitiveString("Abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(s1);
        System.out.println(list.contains(s1));
        System.out.println(list.contains(s2));

    }


    // 无法在扩展可实例化类的同时,既增加新的组件又保留equals约定
    // 此种方案无法满足传递性
    public static void example2() {
        ColorPoint point1 = new ColorPoint(1, 2, Color.RED);
        Point point2 = new Point(1, 2);
        ColorPoint point3 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println("1-2" + point1.equals(point2));
        System.out.println("2-3" + point2.equals(point3));
        System.out.println("1-3" + point1.equals(point3));

    }

    //一种权宜之计(组合代替继承)
    public static void example3() {
        CombinationColorPoint point1 = new CombinationColorPoint(1, 2, Color.RED);
        Point point2 = new Point(1, 2);
        CombinationColorPoint point3 = new CombinationColorPoint(1, 2, Color.BLUE);

        System.out.println("1-2" + point1.equals(point2));
        System.out.println("2-3" + point2.equals(point3));
        System.out.println("1-3" + point1.equals(point3));

    }

}
