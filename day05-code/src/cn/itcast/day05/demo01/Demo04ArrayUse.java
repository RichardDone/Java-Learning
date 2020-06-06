package cn.itcast.day05.demo01;
/*
直接打印数组名称，得到的是数组对应的内存地址哈希值。
 */

public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = {10,20,30};

        System.out.println(arrayA); //[I@1b6d3586 内存地址哈希值

        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        int num = arrayA[1];
        System.out.println(num);
    }
}
