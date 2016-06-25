package com.nixon;

public class Test {
    private static final String str = "Hello";

    public static void main(String[] args) {
        Benz benz = new Benz();
        benz.sayHello();

        Car car = new Car("Car");
        car.sayHello();

        Car newCar = new Benz();
        newCar.sayHello();

        System.out.println("-------");

        System.out.println(str);
        // str = "123";  // 提示语法错误, final 数据不可再更改


        QQ qq = new QQ();
    }
}


class Car {
    Car(String name) {
        System.out.println("Hello Car: " + name);
    }

    void sayHello() {
        System.out.println("I'm Car");
    }
}

class Benz extends Car {
    Benz() {
        super("Benz");
        System.out.println("Hello Benz");
    }

    @Override
    void sayHello() {
        System.out.println("I'm Benz");
    }
}

final class QQ {
    QQ() {
        System.out.println("Hello QQ");
    }
}

/* //: 提示语法错误, final类不可再继承
class ZZ extends QQ {
    ZZ() {
         System.out.println("Hello ZZ");
    }
}
//*/
