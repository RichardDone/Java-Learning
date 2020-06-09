package cn.itcast.day07.demo02;
/*
匿名对象可以作为方法的参数和返回值
 */
import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        //匿名对象
//        int num1 = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num1);

        //使用一般方法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //匿名对象作为参数
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        //匿名对象作为返回值
        return new Scanner(System.in);
    }
}
