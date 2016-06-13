package com.nixon;

import com.lovely.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Yang");

        System.out.println(cat);

        cat = null;
        System.gc();
    }
}
