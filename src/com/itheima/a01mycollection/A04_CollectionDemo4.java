package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用增强for进行遍历
        //快捷键  集合名称.for
        for (String s : coll) {
            s = "qqq";
        }

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
