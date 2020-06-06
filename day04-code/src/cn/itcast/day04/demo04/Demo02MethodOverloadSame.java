package cn.itcast.day04.demo04;
/*
比较两个数据相等
参数类型分别为两个byte，两个short，两个int，两个long
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a =10;
        byte b =20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)a,(short) b));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,10L));

    }
    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte参数执行");
        boolean same;
        if(a==b)
        {
            same = true;
        }
        else
        {
            same = false;
        }
        return same;
    }
    public static boolean isSame(short a,short b)
    {
        System.out.println("两个short参数执行");
        boolean same = a==b ? true:false;
        return same;
    }
    public static boolean isSame(int a,int b)
    {
        System.out.println("两个int参数执行");
        return a==b;
    }
    public static boolean isSame(long a,long b)
    {
        System.out.println("两个long参数执行");
        if(a==b)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
