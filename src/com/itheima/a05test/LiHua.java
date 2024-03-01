package com.itheima.a05test;

public class LiHua extends Cat{
    public LiHua() {
    }

    public LiHua(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
