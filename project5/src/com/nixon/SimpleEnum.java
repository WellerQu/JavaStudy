package com.nixon;

import com.practice.Spiciness;

public class SimpleEnum {
    public SimpleEnum() {

    }

    public static void main(String[] args) {
        Spiciness spiciness = Spiciness.HOT;
        System.out.println("Hello Enum");
        System.out.println(spiciness);


        System.out.println(spiciness.ordinal());

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ":" + s.ordinal());
            System.out.println(s + ":" + s.getValue());
        }
    }
}
