package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Richard");
        stu1.setAge(23);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("==========");

        stu1.setAge(24);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());

    }
}
