package com.my.learn.apachecommon.lang3;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class NumberUtilsTest {
    @Test
    public void testNumber(){
        String number1 = "1432";
        String number2 = "12.1";
        String number3 = "-12";
        String number4 = "+12";
        String number5 = "08";
        //isDigits只能判断纯数字
        System.out.println(NumberUtils.isDigits(number1));
        System.out.println(NumberUtils.isDigits(number2));
        System.out.println(NumberUtils.isDigits(number3));
        System.out.println(NumberUtils.isDigits(number4));
        System.out.println(NumberUtils.isDigits(number5));
        System.out.println("-------------------");
        //isParsable能判断数字和带小数点的和带负号的,不能判断带正号的
        System.out.println(NumberUtils.isParsable(number1));
        System.out.println(NumberUtils.isParsable(number2));
        System.out.println(NumberUtils.isParsable(number3));
        System.out.println(NumberUtils.isParsable(number4));
        System.out.println(NumberUtils.isParsable(number5));
        System.out.println("++++++++++++++");
        //isCreatable能判断数字和带小数点的,和带正负号的,以及进制,
        // 但是如果数字是09这种会报错,因为被识别为了八进制
        System.out.println(NumberUtils.isCreatable(number1));
        System.out.println(NumberUtils.isCreatable(number2));
        System.out.println(NumberUtils.isCreatable(number3));
        System.out.println(NumberUtils.isCreatable(number4));
        System.out.println(NumberUtils.isCreatable(number5));



    }
}
