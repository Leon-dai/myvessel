package com.itheima.a05test;

public class Husky extends Dog{
    public Husky() {
    }

    public Husky(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
