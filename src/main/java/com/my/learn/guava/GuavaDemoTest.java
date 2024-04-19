package com.my.learn.guava;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GuavaDemoTest {

    @Test
    public void testJoinerAndSplitter(){
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"32","dds",null,"23ddw");
        Joiner joiner = Joiner.on(",").skipNulls();
        String join = joiner.join(strings);
        System.out.println(join);
        Joiner joiner1 = Joiner.on("-").useForNull("^_^");
        System.out.println(joiner1.join(strings));

        String collect = strings.stream().filter(a -> a != null).collect(Collectors.joining(","));
        System.out.println(collect);

        String str = "a,, b  ,c__,\"\",_e,";
        Splitter on = Splitter.on(",").omitEmptyStrings().trimResults(CharMatcher.is('_'));
        Iterable<String> split = on.split(str);
        System.out.println(split);
        List<String> strings1 = on.splitToList(str);
        System.out.println(strings1);
    }

    @Test
    public void test2(){
        String s = "studentName";
        String to = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, s);
        System.out.println(to);
    }
}
