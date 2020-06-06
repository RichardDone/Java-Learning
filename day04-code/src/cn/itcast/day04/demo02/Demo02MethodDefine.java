package cn.itcast.day04.demo02;

/*
方法就是若干语句的功能集合
参数；
返回值

定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，。。。）{
    方法体
    return 返回值;
    }

方法的三种调用方式：
1.单独调用：方法名称（参数）
2.打印调用：System.out.println(方法（参数）)
3.赋值调用: 数据类型 变量 = 方法（参数）

void 只能单独调用
 */

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        Sum(10,20);
        System.out.println("==========");
        //打印调用
        System.out.println(Sum(10,20));
        System.out.println("==========");
        //赋值调用
        int number = Sum(15,25);
        System.out.println("变量的值："+ number);
    }

    public static int Sum(int a,int b){
        System.out.println("方法已调用");
        int result = a+b;
        return result;
    }
}
