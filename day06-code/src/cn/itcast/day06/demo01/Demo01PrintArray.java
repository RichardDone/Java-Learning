package cn.itcast.day06.demo01;

import java.util.Arrays;

/*
面向过程：实现一个功能，每个步骤亲力亲为，详细处理每个细节
面向对象：实现一个功能，不关系具体步骤，找一个已经具有该功能的方法实现
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40 ,50, 60};
        //要求打印格式为 [10, 20, 30, 40, 50]

        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1)
            {
                System.out.println(array[i]+"]");
            }else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("===============");

        //使用面向对象
        //toString直接把数组变成字符串
        System.out.println(Arrays.toString(array));
    }
}
