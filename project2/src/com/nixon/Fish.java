package com.nixon;

class Fish {
    Fish() {
        System.out.println("Constructor");
    }

    Integer number = getNumber();
    static String str = getString();

    Integer getNumber() {
        System.out.println("intiliaze instance member");
        return 0;
    }

    static String getString() {
        System.out.println("intilize static member");
         return "string";
    }
}
