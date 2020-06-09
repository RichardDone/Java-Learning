package cn.itcast.day06.demo05;
/*
一个标准的类有四个组成部分：
1.所有成员变量需要private修饰
2.为每一个成员变量编写一个Get/Set方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
