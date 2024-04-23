package com.my.learn.guava;

import org.junit.Test;

import java.util.List;
import java.util.Objects;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * packageName com.my.learn.guava
 *
 * @author xyk
 * @version JDK 8
 * @className ObjectsTest
 * @date 2024/4/23/0023
 * @description TODO
 */
public class ObjectsTest {

    @Test
    public void test() {
        try {
            Objects.requireNonNull(null);
        }catch (NullPointerException e){
            assertThat(e,is(NullPointerException.class));
        }
    }

    @Test
    public void testAssert(){
        List<String> s = null;
        try {
            assert s != null : "see this error";
        }catch (AssertionError e){
            assertThat(e,is(AssertionError.class));
            assertThat(e.getMessage(),equalTo("see this error"));
        }
    }
}
