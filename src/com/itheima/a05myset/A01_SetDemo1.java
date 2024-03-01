package com.itheima.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        /*
            利用Set系列的集合，添加字符串，并使用多种方式遍历。
            迭代器
            增强for
            Lambda表达式
         */

        //1.创建一个Set集合的对象,Set是一个接口，只能创建它的实现类对象
        Set<String> set = new HashSet<>();

        //2.添加元素
        boolean r1 = set.add("张三");//true
        boolean r2 = set.add("张三");//false
        set.add("李四");
        set.add("王五");

        System.out.println(r1);
        System.out.println(r2);

        //打印集合
        //无序
        System.out.println(set);

        //遍历集合
        //1.迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //2.增强for
        for (String s : set) {
            System.out.println(s);
        }

        //3.Lambda表达式
        set.forEach(s -> System.out.println(s));


    }
}
