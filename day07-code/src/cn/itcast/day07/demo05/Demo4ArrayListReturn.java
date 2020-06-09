package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
大集合存储20个随机数字，筛选出偶数元素放入小集合中
要求使用自定义的方法来实现筛选

集合是方法的参数，也可以是方法的返回值。
传入和返回的都是集合的地址值。
 */
public class Demo4ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> bigList= new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);
        }
        System.out.println(bigList);

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数共有：" + smallList.size());
        System.out.println(smallList);

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num%2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}
