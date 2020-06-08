package cn.itcast.day06.demo03;
/*
封装，继承，多态

封装在JAVA中的体现：
1.方法就是一种封装
2.关键字private就是一种封装

封装讲一些细节信息隐藏起来，对外界不可见。
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35, 67};
        int max = getMax(array);
        System.out.println(max);

    }
    public static int getMax(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
