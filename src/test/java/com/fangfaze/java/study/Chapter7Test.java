package com.fangfaze.java.study;

import com.fangfaze.java.study.chapter7.CollectionClassifier;
import com.fangfaze.java.study.chapter7.Lists;
import com.fangfaze.java.study.chapter7.Period;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.locks.Condition;

public class Chapter7Test {

    /**
     * 第38条 检查参数的有效性
     */
    @Test
    public void rule38() throws Exception {

    }

    /**
     * 第39条 必要时进行保护性拷贝
     */
    @Test
    public void rule39() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1999);
        Date start = calendar.getTime();
        calendar.set(Calendar.YEAR, 2000);
        Date end = calendar.getTime();
        Period period = new Period(start, end);
//        end.setYear(97);
        period.getEnd().setYear(98);

        System.out.println(period.getStart().toString() + "==>" + period.getEnd().toString());
    }

    /**
     * 第40条 谨慎的审计方法签名
     */

    @Test
    public void rule40() throws Exception {
    }

    /***
     * 第41条 慎用重载
     *
     */

    @Test
    public void rule41() throws Exception {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<String>(),
                new HashMap<Integer, Integer>().keySet()
        };

        for (Collection<?> c : collections) {
            System.out.println(CollectionClassifier.classify(c));
        }


        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = -3; i < 3; ++i) {
            set.add(i);
            list.add(i);
        }
        for (Integer i = 0; i < 3; ++i) {
            set.remove(i);
            list.remove(i);
        }
        System.out.println(set + "  " + list);


    }

    /**
     * 第42条 慎用可变参数
     */
    @Test
    public void rule42() throws Exception {
        int[] numbers = {1, 2, 3};
        String[] strings = {"1", "2", "3"};
        System.out.println(Arrays.asList(numbers));
        System.out.println(Arrays.asList(strings));
        System.out.println(Arrays.toString(numbers));
    }

    /**
     * 第43条 返回零长度的数组火鸡和,而不是null
     */

    @Test
    public void rule43() throws Exception {
        String[] strings = Lists.getStrings();
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
