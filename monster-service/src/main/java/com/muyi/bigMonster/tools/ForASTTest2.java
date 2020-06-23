package com.muyi.bigMonster.tools;

public class ForASTTest2 {
    public static void main(String[] args) {
        System.out.println("main");

        ForASTTest astTest = new ForASTTest();
        astTest.case01(22);

        System.out.println(astTest.a);

    }

    public void case01() {
        System.out.println("case01");
    }

    public String case022(Integer i) {
        System.out.println("case0222");
        return "case02";
    }
}
