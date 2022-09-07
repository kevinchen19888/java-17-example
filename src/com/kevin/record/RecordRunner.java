package com.kevin.record;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class RecordRunner {
    public static void main(String[] args) throws NoSuchMethodException {
        RecordDemo record = new RecordDemo("kevin", 20);
        System.out.println(record.name());
        System.out.println(record);

        Method method = RecordDemo.class.getDeclaredMethod("name");
        System.out.println(Arrays.toString(method.getAnnotations()));

        RecordDemo record2 = new RecordDemo(10);
        System.out.println(record2);

        List<Integer> list = Arrays.asList(1, 2);




    }
}
