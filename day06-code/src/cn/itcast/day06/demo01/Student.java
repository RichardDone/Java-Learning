package cn.itcast.day06.demo01;
/*
定义学生类

属性（是什么）：姓名，年龄
行为（做什么）：吃饭，睡觉，学习

对应到JAVA的类当中
成员变量（属性）：
    String name；//姓名
    int age；//年龄
成员方法（行为）：
    public void eat(){};//吃饭
    public void sleep(){};//睡觉
    public void study(){};//学习

注意事项：
1.成员变量直接定义在类中，在方法外面
2.成员方法无static
 */
public class Student {
    //成员变量
    String name; //姓名
    int age; //年龄

    //成员方法
    public void eat()
    {
        System.out.println("吃饭！");
    }
    public void sleep(){
        System.out.println("睡觉！");
    }
    public void study(){
        System.out.println("学习！");
    }
}
