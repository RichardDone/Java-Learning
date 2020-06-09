package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
数组长度不可以发生改变
但是ArrayList集合的长度可以随意改变

ArrayList<E> E代表泛型，只能是引用类型，不能是基本类型
注意事项：
对于ArrayList集合来说直接打印得到的不是地址值而是内容
如果内容是空，得到的是空的中括号:[]

 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); //[]

        //添加用add
        list.add("Richard");
        System.out.println(list);

        list.add("Mystics");
        list.add("Ignite");
        System.out.println(list);

    }
}
