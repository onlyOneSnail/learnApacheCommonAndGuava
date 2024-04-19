package com.my.learn.apachecommon.lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
    /**
     * 判断字符串是否为null,'','   '
     */
    @Test
    public void testStringUtilsBlank(){
        String str = " ";
        boolean blank = StringUtils.isBlank(str);
        System.out.println(blank);
        boolean notBlank = StringUtils.isNotBlank(str);
        System.out.println(notBlank);
    }

    /**
     * 判断字符串是否为null,''
     */
    @Test
    public void testStringUtilsEmpty(){
        String str = " ";
        boolean blank = StringUtils.isEmpty(str);
        System.out.println(blank);
        {
            boolean notBlank = StringUtils.isNotEmpty(str);
            System.out.println(notBlank);
        }
    }

    /**
     * 填充和截取
     */
    @Test
    public void testStringUtilsLeft(){
        String str = "12345678915";
        String substring = str.substring(1);
        System.out.println(substring);
        //left 从左往右截取字符串 N 位
        String left = StringUtils.left(str, 3);
        System.out.println("left" + left);
        //right 从右往左截取字符串 N位
        String right = StringUtils.right(str, 4);
        System.out.println("right:" + right);
    }
}
