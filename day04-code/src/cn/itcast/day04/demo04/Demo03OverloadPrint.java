package cn.itcast.day04.demo04;
/*
byte short int long float double char boolean
String
 */
// 在调用输出语句的时候，println方法其实进行了很多类型的重载
public class Demo03OverloadPrint {
    public static void main(String[] args) {
        myPrint(10);
        myPrint("hello");
    }

    public static void myPrint(byte num)
    {
        System.out.println(num);
    }
    public static void myPrint(short num)
    {
        System.out.println(num);
    }
    public static void myPrint(int num)
    {
        System.out.println(num);
    }
    public static void myPrint(long num)
    {
        System.out.println(num);
    }
    public static void myPrint(float num)
    {
        System.out.println(num);
    }
    public static void myPrint(double num)
    {
        System.out.println(num);
    }
    public static void myPrint(char zifu)
    {
        System.out.println(zifu);
    }
    public static void myPrint(boolean is)
    {
        System.out.println(is);
    }
    public static void myPrint(String str)
    {
        System.out.println(str);
    }
}
