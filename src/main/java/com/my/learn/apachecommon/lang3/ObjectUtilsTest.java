package com.my.learn.apachecommon.lang3;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;

import java.io.Serializable;

public class ObjectUtilsTest {
    /**
     * 返回第一个不是null的值
     *
     * System.identityHashCode(object)不管object是否重写了hashcode,始终调用Object的hashcode获取地址
     */
    @Test
    public void testObject() {
        Serializable serializable = ObjectUtils.firstNonNull(null, null, 3, "23", null);
        System.out.println(serializable.toString());

        String asd = ObjectUtils.identityToString("asd");
        System.out.println(asd);
    }
}
