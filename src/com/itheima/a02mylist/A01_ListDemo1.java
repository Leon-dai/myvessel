package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {

        /*
           List系列集合独有的方法：
                void add(int index, E element)          在此集合中的指定位置插入指定的元素
                E remove(int index)                     删除指定索引处的元素，返回被删除的元素
                E set(int index,E element)              修改指定索引处的元素，返回被修改的元素
                E get(int index)                        返回指定索引处的元素
         */

        //1.创建一个集合
        //List是一个接口，不能直接创建它的对象，要创建它的实现类的对象
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //void add(int index, E element)          在此集合中的指定位置插入指定的元素
        //细节：原来索引上的元素会依次往后移
        list.add(1, "QQQ");

        //E remove(int index)                     删除指定索引处的元素，返回被删除的元素
        String str = list.remove(1);
        System.out.println(str);

        //3.打印集合
        System.out.println(list);
    }
}
