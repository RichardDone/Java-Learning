package cn.itcast.day05.demo03;

/*
求长度
数组的名字存在栈中，是一个地址。数组的存储空间在堆中开辟。

数组长度在程序运行期间不会发生改变，每次new的数组空间一旦确定不可修改

如果要修改数组长度必须再在堆中开辟一块新的空间
 */

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10,20,30,3,4,5,6,7,8,9,10};
        int len = arrayB.length;
        System.out.println("arrayB的是长度是" + len);

        System.out.println("==============");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);

        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
