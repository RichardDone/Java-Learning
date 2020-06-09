package cn.itcast.day07.demo03;

import java.util.Random;

/*
Random类用来生成随机数字
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);

    }
}
