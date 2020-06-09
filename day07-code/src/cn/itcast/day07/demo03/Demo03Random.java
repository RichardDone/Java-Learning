package cn.itcast.day07.demo03;

import java.util.Random;

/*
获取范围[1,n]范围内的随机数
 */
public class Demo03Random {

    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(n) + 1;
            System.out.println(num);
        }

    }
}
