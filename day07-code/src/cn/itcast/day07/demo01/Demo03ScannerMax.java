package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
求三个数字中的最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int tem = a > b ? a:b;
        int max = tem > c? tem:c;

        System.out.println("最大值为：" + max);
    }
}
