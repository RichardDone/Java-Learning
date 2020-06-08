package cn.itcast.day06.demo01;
/*
类不可直接使用，需要创建一个对象才能使用

1.导入包，指出需要使用的类在什么位置
import 包名称.类名称;
import cn.itcast.day06.demo01.Student;
对于和当前类在同一个包的情况下，可以省略导包语句不写
2.创建，格式
类名称 对象名  =  new  类名称（）
Student stu = new Student()

3.使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
（也就是想用谁就用对象名.谁)
 */
public class Demo02Student {
    public static void main(String[] args) {
        //1.导包

        //2.创建
        Student stu = new Student();

        //3.使用成员变量
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=================");

        //改变对象当中的成员变量数值内容
        stu.name = "周杰伦";
        stu.age = 41;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=================");

        //4.使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
