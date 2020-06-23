package com.muyi.bigMonster.tools;

public class ForASTTest {
    public int a = 2;
    public int b = 3;

    public static void main(String[] args) {
        System.out.println("main");
    }

    public void case01(int a) {
        this.a = a;
        System.out.println("case01");
        System.out.println(a);
    }

    public String case02() {
        System.out.println("case02");
        return "case02";
    }
}
