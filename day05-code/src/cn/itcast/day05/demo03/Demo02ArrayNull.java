package cn.itcast.day05.demo03;
/*
空指针异常
 */


public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}
