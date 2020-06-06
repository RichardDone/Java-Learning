package cn.itcast.day05.demo01;
/*
静态初始化：
创建数组时不直接指定数据个数，而是直接将数据内容进行指定

静态初始化基本格式：
数据类型[] 数组名 = new 数据类型[] {元素1，元素2，.....}
 */
public class Demo02Array {
    public static void main(String[] args) {
        // 创建int数组，5,15,25
        int[] arrayA =new int[] {5,15,25};
        // 创建String数组
        String[] arrayB = new String[] {"HelloWorld","Hello","World"};
    }
}
