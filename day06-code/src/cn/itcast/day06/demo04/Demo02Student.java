package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("=========");
        Student stu2 = new Student("JAY",12);

        System.out.println("=========");
        System.out.println("姓名" + stu2.getName() + " 年龄：" + stu2.getAge());

        //如果需要改变对象中的数据内容，仍然需要使用set
        stu2.setAge(13);
        System.out.println("改变年龄");
        System.out.println("姓名" + stu2.getName() + " 年龄：" + stu2.getAge());


    }
}
