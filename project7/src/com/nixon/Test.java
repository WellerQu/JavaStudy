package com.nixon;

public class Test {
    public static void main(String[] args) {
        Benz benz = new Benz();
    }
}


class Car {
    Car(String name) {
        System.out.println("Hello Car: " + name);
    }
}

class Benz extends Car {
    Benz() {
        super("Benz");
        System.out.println("Hello Benz");
    }
}
