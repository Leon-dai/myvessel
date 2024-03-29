package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
            List系列集合的五种遍历方式：
                1.迭代器
                2.列表迭代器
                3.增强for
                4.Lambda表达式
                5.普通for循环
         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        //2.增强for
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda表达式
        //list.forEach(s -> System.out.println(s));

        //4.普通for循环
        //size方法和get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        //5.列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        //额外添加了一个方法，在遍历的过程中，可以添加元素
        //list:[aaa, bbb, ccc]
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next();
            if("bbb".equals(str)){
                //qqq
                it.add("qqq");//利用列表迭代器的添加方法
            }
        }
        System.out.println(list);//[aaa, bbb, qqq, ccc]


    }
}
