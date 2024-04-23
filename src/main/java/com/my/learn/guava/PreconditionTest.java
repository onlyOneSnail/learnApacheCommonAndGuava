package com.my.learn.guava;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * packageName com.my.learn.guava
 *
 * @author xyk
 * @version JDK 8
 * @className PreconditionTest
 * @date 2024/4/23/0023
 * @description TODO
 */
public class PreconditionTest {
    @Test
    public void test() throws Exception {
        /*try {
            nullPointer();
        }catch (NullPointerException e){
            assertThat(e, is(NullPointerException.class));
        }*/
        add(2,5);
    }

    public void nullPointer() throws Exception {
        Object o = Preconditions.checkNotNull(null);
    }

    public int add(int a, int b) {
        try {
            Preconditions.checkArgument(a > 5, "a must greater than %s", "5");
        }catch (IllegalArgumentException e){
            assertThat(e,is(IllegalArgumentException.class));
        }
        return a + b;
    }

    @Test
    public void testState(){
        final String state = "sleep";
        try {
            Preconditions.checkState(state.equals("A"),"not A %s","this is sleep");
        }catch (IllegalStateException e){
            assertThat(e,is(IllegalStateException.class));
        }
    }

    @Test
    public void testIndex(){
        List<String> list = ImmutableList.of("a", "b", "c");
        try {
            Preconditions.checkElementIndex(5,list.size());
        }catch (IndexOutOfBoundsException e){
            assertThat(e, is(IndexOutOfBoundsException.class));
        }
    }
}
