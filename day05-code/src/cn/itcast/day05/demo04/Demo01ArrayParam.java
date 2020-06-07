package cn.itcast.day05.demo04;

/*
方法调用的数组时，传入的参数是数组的地址。
 */

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50};

        System.out.println(array); //地址值

        PrintArray(array); //传递的是地址值
        System.out.println("aaa");
        PrintArray(array);
        System.out.println("bbb");

    }
    public static void PrintArray(int[] array)
    {
        System.out.println("函数接收的参数是:");
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
