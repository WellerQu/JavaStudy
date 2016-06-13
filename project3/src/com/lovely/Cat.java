package com.lovely;

public class Cat {
    public Cat(String name) {
        this.name = name;
    }

    private String name;

    //: override super method
    public String toString() {
        return "Hello " + name;
    }

    protected void finalize() {
        System.out.println("Goodbye "+ name);
        // super.finalize();
    }
}
