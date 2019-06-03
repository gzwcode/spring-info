package com.gzw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ThreadTest {

    public static void main(String[] args) {

        //正常写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        }).start();

        //lambda写法
        new Thread(() -> {
            System.out.println("run lambda");
        }).start();

        List<String> list = Arrays.asList("I", "love", "you", "too");
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 == null)
                    return -1;
                if (s2 == null)
                    return 1;
                return s1.length() - s2.length();
            }
        });
        System.out.println(list);

        Collections.sort(list, (s1, s2) -> {
            if (s1 == null)
                return -1;
            if (s2 == null)
                return 1;
            return s1.length() - s2.length();
        });

        ConsumerInterface<String> consumer = str -> System.out.println(str);

        consumer.accept("hello");

        MyStream<String> myStream = new MyStream<>();
        myStream.setList(list);
        myStream.myForEach(s -> {
            System.out.println(s);
        });

        System.out.println(list);
        List<String> lists =new ArrayList(list);
        lists.removeIf(str-> str.length()<3);
        System.out.println(lists);



        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map.getOrDefault(6,"12133"));
    }
}
