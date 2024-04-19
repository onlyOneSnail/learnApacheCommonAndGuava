package com.my.learn.apachecommon.lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class ArrayUtilsTest {

    /**
     * isEmpty判断数组是否为null或者长度为0
     * add 往数组中添加元素并返回新的数组
     */
    @Test
    public void testArray(){
        int[] a = new int[0];
        boolean empty = ArrayUtils.isEmpty(a);
        System.out.println(empty);
        int[] add = ArrayUtils.add(a, 4);
    }
}
