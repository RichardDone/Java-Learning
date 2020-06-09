package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
存储基本类型必须使用对应的包装类
基本类型 包装类（引用类型，包装类都位于java.lang）
byte    Byte
short   Short
int     Integer    [特殊]
long    Long
float   Float
double  Double
char    Character  [特殊]
boolean Boolean

JDK1.5开始，支持自动装箱、自动拆箱
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //错误写法，必须是引用类型，不能是基本类型
//        ArrayList<int> listB = new ArrayList<int>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("第2个元素是：" + num);
    }
}
