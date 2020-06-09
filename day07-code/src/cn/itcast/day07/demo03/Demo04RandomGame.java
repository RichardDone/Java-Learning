package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
模拟猜数字

1.产生随机数，不再变化，Random中的nextInt
2.键盘输入 Scanner
3.获取键盘输入的数字 Scanner.nextInt
4.得到两个数字，判断（if），三种情况，过大重试，过小重试，猜中
5.重试再来一次，循环次数不确定，用while(true)。
 */
public class Demo04RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1; //1~100

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入猜测的数字:");
            int guessNum = sc.nextInt(); //键盘输入的数字

            if(randomNum < guessNum){
                System.out.println("太大了，请重试。");
            }
            else if(randomNum > guessNum){
                System.out.println("太小了，请重试。");
            }
            else{
                System.out.println("恭喜你，猜中了！");
                break;
            }
        }
        System.out.println("游戏结束");

    }
}
