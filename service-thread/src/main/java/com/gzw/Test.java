package com.gzw;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int [] array={1,2,3,4};
        Arrays.stream(array).forEach(System.out::println);
    }
}
