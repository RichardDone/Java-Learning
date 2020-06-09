package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList常用方法:
public boolean add(E e):向集合当中添加元素，参数类型和泛型一致
对于ArrayList来说添加一定成功，返回值一定是true，但是其他集合可能不成功。
public E get(int index):从集合当中获取元素，参数是索引编号，返回值是对应位置的元素
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值是被删除的元素
public int size():获取集合的尺寸长度，返回时数组中的元素个数
 */
public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素
        boolean success = list.add("Richard");
        System.out.println(list);
        System.out.println("添加是否成功：" + success); //true

        list.add("Mystics");
        list.add("Ignite");
        list.add("Solitary");
        list.add("Lonely");
        System.out.println(list);

        //从集合中获取元素:get
        String str = list.get(3);
        System.out.println("第4号索引位置是：" + str);

        //从集合中删除元素:remove
        String whoRemoved = list.remove(3);
        System.out.println("被删除的是谁：" + whoRemoved);
        System.out.println(list);

        //获取集合长度尺寸，集合元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);


    }
}
