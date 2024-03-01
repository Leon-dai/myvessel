package com.itheima.a05test;

public abstract class Cat extends Animal{
    //1.继承抽象类，重写里面所有的抽象方法
    //2.本身Cat也是一个抽象的，让Cat的子类再重写抽象方法

    //此时采取第二种处理方案
    //因为猫的两个子类中eat的方法体还是不一样的

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }


}
