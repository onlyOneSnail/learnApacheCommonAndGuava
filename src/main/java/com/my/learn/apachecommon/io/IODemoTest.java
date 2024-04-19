package com.my.learn.apachecommon.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class IODemoTest {
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\yjx\\mavenproject\\learnApacheCommonAndGuava\\src\\main\\resources\\neadRead.txt");
        String s = FileUtils.readFileToString(file, Charset.forName("UTF-8"));
        System.out.println(s);
    }

    @Test
    public void test2() throws IOException {
        File file = new File("D:\\yjx\\mavenproject\\learnApacheCommonAndGuava\\src\\main\\resources\\neadRead.txt");
        List<String> strings = FileUtils.readLines(file, StandardCharsets.UTF_8);
        strings.stream().forEach(System.out::println);
        String extension = FilenameUtils.getExtension(file.getName());
        String baseName = FilenameUtils.getBaseName(file.getName());
        System.out.println(extension);
        System.out.println(baseName);
    }
}
