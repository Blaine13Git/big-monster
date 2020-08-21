package com.muyi.bigMonster.lilianTest;

import java.util.concurrent.ConcurrentHashMap;

public class Lesson01 {

    static ThreadLocal<Integer> data = new ThreadLocal();

    static volatile int a = 0;

    public static void main(String[] args) {
        ConcurrentHashMap cMap = new ConcurrentHashMap<>();

        System.out.println();

    }
}




