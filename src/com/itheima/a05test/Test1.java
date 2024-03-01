package com.itheima.a05test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        PersianCat pc = new PersianCat("小波", 2);
        LiHua lc = new LiHua("小狸", 3);
        cats.add(pc);
        cats.add(lc);
        keepPet(cats);

        ArrayList<Dog> dogs = new ArrayList<>();
        Teddy teddy = new Teddy("小泰", 4);
        Husky husky = new Husky("小哈", 5);
        dogs.add(teddy);
        dogs.add(husky);
        keepPet(dogs);

        /*ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("学生A", 18);
        Student s2 = new Student("学生B", 25);
        students.add(s1);
        students.add(s2);
        keepPet(students);//报错*/

    }

    /*public static void keepPet(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }*/

    /*public static void keepPet(ArrayList<? extends Dog> list){
        for (Dog dog : list) {
            dog.eat();
        }
    }*/

    public static void keepPet(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
