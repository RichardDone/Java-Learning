package cn.itcast.day05.demo04;

/*
方法只能有一个返回值。
多个数据返回，使用数组
数组作为方法的参数，传递进去和返回的都是数组的地址值
 */

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = Calculate(10,20,30);

        System.out.println("返回数组地址值："+result);
        System.out.println("总和："+result[0]);
        System.out.println("平均数："+result[1]);
    }
    public static  int[] Calculate(int a,int b,int c)
    {
        int sum = a + b + c;
        int avg = sum/3;
        // 两个结果都需要返回,用数组存储
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        System.out.println("Calculate方法内数组地址值："+array);
        //int[] array = {sum,avg};

        return array;
    }
}
