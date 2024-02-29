package com.itheima.a04mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String str = list.get(1);
        System.out.println(str);

        System.out.println(list);

    }
}
