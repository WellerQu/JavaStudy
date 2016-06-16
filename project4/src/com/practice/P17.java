package com.practice;

public class P17 {
    public P17() {
        System.out.println("P17 无参数构造");
    }

    private String str;

    public P17(String str) {
        this.str = str;
        System.out.println("P17 " + str);
    }
}
