package com.my.learn.apachecommon.collections4;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.SetUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Collections4DemoTest {
    @Test
    public void test() {
        ArrayList<String> strings = new ArrayList<>();
        boolean empty = CollectionUtils.isEmpty(strings);
        System.out.println(empty);
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(MapUtils.isNotEmpty(map));
        Integer integer = MapUtils.getInteger(map, "45");
        System.out.println("integer" + integer);
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println(CollectionUtils.isNotEmpty(treeSet));
        //java.lang.UnsupportedOperationException,静态常量不可修改
        Set<Object> objects = SetUtils.emptySet();
//        objects.add("as");
        System.out.println(objects.toArray().toString());
    }
    @Test
    public void testCollection(){
        ArrayList<String> stringsFirst = new ArrayList<>();
        Collections.addAll(stringsFirst,"1","2","3","3","4","5","6","7","8");
        ArrayList<String> stringsSecond = new ArrayList<>();
        stringsSecond.add("3");
        stringsSecond.add("5");
        stringsSecond.add("6");
        stringsSecond.add("1");
        stringsSecond.add("1");
        stringsSecond.add("10");
        //取交集
        Collection<String> intersection = CollectionUtils.intersection(stringsFirst, stringsSecond);
        System.out.println(intersection.toString());
        //取并集
        Collection<String> union = CollectionUtils.union(stringsFirst, stringsSecond);
        System.out.println(union.toString());
        //取差值
        Collection<String> subtract = CollectionUtils.subtract(stringsFirst, stringsSecond);
        System.out.println(subtract.toString());
    }
}
