package com.my.learn.guava;

import cn.hutool.core.util.CharUtil;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * packageName com.my.learn.guava
 *
 * @author xyk
 * @version JDK 8
 * @className JoinerText
 * @date 2024/4/19/0019
 * @description TODO
 */
public class JoinerTest {

    public static final List<Person> PERSON_LIST =
            Lists.newArrayList(new Person("jone","student"),
                    new Person("jone","teacher"),
                    new Person("bob","student"),
                    new Person("alias","student"),
                    new Person("jone","shopper"),
                    new Person("jone","master"));

    public static final Map<String,String> Map_Str = Maps.newHashMap();

    {
        Map_Str.put("hello", "world");
        Map_Str.put(null, "monkey");
        Map_Str.put("bye", "slipping");
    }

    @Test
    public void testJoinerWithOnAndSkipNulls(){
        Joiner joiner = Joiner.on(CharUtil.COMMA).skipNulls();
        Map<String, String> collect = PERSON_LIST.stream().collect(Collectors.toMap(Person::getName, Person::getJob, (a, b) -> joiner.join(a, b)));
        collect.forEach((a,b) -> {
            System.out.println(joiner.join(a,"---",b));
        });
    }

    @Test
    public void testJoinWithUseForNullAndWithKeyValueSeparator(){
        Joiner joiner = Joiner.on(CharUtil.COLON).useForNull(String.valueOf(CharUtil.UNDERLINE));
        Joiner.MapJoiner mapJoiner = joiner.withKeyValueSeparator(CharUtil.DOT);
        String join = mapJoiner.join(Map_Str);
        System.out.println(join);
    }

    @Test
    public void test(){
        Joiner joiner = Joiner.on(CharUtil.COMMA).skipNulls();
        //stringBuilder和stringBuilder1其实是同一个对象
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = joiner.appendTo(stringBuilder, "aaa", "bbbb", "ccccc");
        System.out.println(stringBuilder == stringBuilder1);
        System.out.println(stringBuilder.hashCode() == stringBuilder1.hashCode());
        System.out.println(System.identityHashCode(stringBuilder) == System.identityHashCode(stringBuilder1));

        StringBuilder stringBuilder2 = joiner.appendTo(new StringBuilder(), "aaa", "bbbb", "ccccc");
        System.out.println(stringBuilder2);

    }
}
