package cn.itcast.day05.demo01;
/*
数组初始化：在内存当中创建一个数组，并且向其中赋予一些默认值

两种常见的初始化：
1.动态初始化（指定长度）
2.静态初始化（指定内容）

动态初始化格式
数据类型 [] 数组名称 = new 数据类型[数据长度];
 */

public class Demo01Array {
    public static void main(String[] args) {
        // 动态初始化
        int[] arrayA = new int[300];

        double[] arrayB = new double[10];

        String[] arrayC = new String[5];
    }
}
