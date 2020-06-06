package cn.itcast.day05.demo01;
/*
动态创建默认值：
整数类型：0
浮点类型：0.0
字符类型：'\u0000'
布尔类型：false
索引类型：null

静态初始化也有默认值，只是被大括号里的值替换了
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] array = new int[3];

        System.out.println(array); //[I@1b6d3586
        System.out.println(array[0]); //0
        System.out.println(array[1]); //0
        System.out.println(array[2]); //0

        System.out.println("=========");

        array[2] = 123;
        array[1] = 12;
        array[0] = 1;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
