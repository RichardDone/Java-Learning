package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
定义4个学生对象，添加到集合并遍历

思路：
1.定义Student学生类，四个部分。
2.创建集合用来存储学生对象，泛型:<Student>
3.创建类创建4个学生对象并且赋值。
4.学生对象添加到集合中，add
5.遍历集合。for，get，setsize
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳锋",22);
        Student three = new Student("黄药师",24);
        Student four = new Student("段智兴",26);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge());
        }
    }
}
