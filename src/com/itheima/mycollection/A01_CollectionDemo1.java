package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
            public boolean add(E e)             添加
            public void clear()                 清空
            public boolean remove(E e)          删除
            public boolean contains(Object obj）判断是否包含
            public boolean isEmpty()            判断是否为空
            public int size()                   集合长度

            注意点：
            Collection是一个接口，我们不能直接创建他的对象。
            所以，我们现在学习他的方法时，只能创建他实现类的对象。
            实现类:ArrayList

         */

        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节1：往List系列集合中添加元素的时候，永远返回true
        //细节2：往Set系列集合中添加元素的时候，如果当前添加元素已存在返回false，表示添加失败，反之成功，因为Set系列集合不允许重复
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清空
        //coll.clear();

        //3.删除
        //注意：因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除，只能通过元素的对象进行删除。
        //方法会有一个布尔类型的返回值，删除成功返回true，失败返回false
        coll.remove("aaa");
        System.out.println(coll);

        //4.判断元素是否包含
        //细节：底层是依赖equals方法进行判断是否存在的
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法
        //javabean类，比如Student类中，我们可以用alt+insert，选择equals() and hashCode(),一路点到头即可
        boolean result1 = coll.contains("bbb");
        System.out.println(result1);

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);//false

        //6.判断集合的长度
        int size = coll.size();
        System.out.println(size);

    }
}
