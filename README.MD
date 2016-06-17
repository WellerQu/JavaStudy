# 学习Java

### Project1
- 编写makefile
- 编译单文件
- 输出HelloWorld
- 打包成jar包, 并执行jar包

### Project2
- 编写多个文件: Animal.java, Fish.java, IntiliazeMain.java
- 多文件编译时, 在makefile中有顺序限制, **需要保证被依赖的文件先编译**;
- 初始化一个类的顺序: 
    1. 初始化静态结构成员
    2. 初始化实例结构成员
    3. 构造函数(构造函数可看成特殊的静态成员)
- 静态成员仅初始化一次, 仅占用一块存储区域;
- 实例成员每次创建类实例均被初始化, 在每个不同实例间拥有独立的存储区域;

### Project3
- finalize() 用于回收资源, 可以由System.gc()来触发.
- 只有不再被引用的对象(比如引用该对象的变量被赋值为null)的对象才会面临被回收;

### Project4
- 数组长度不可变, ArrayList长度可变;
- 尽量使用已知类型的ArrayList<T>, 否则会得到编译器警告;
- 要使用第三方jar包, 需要在-cp参数中指明: /path/to/xx.jar;

### Project5 
- enmu实际上也是类, 并且可以有自己的方法
