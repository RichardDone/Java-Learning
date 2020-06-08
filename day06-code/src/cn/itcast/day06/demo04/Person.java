package cn.itcast.day06.demo04;
/*
当方法的局部变量和类的成员变量，根据就近原则会优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式
this.xxx

通过谁调用的方法，谁就是this
 */
public class Person {

    String name;

    public void sayHello(String name){
        System.out.println(name + "，你好！我是" + this.name);
        System.out.println(this);
    }
}
