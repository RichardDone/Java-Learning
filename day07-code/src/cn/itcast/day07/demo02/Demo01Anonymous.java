package cn.itcast.day07.demo02;
/*
匿名对象：只有右边的对象，无左边的名字和赋值运算符
new 类名称（）;

匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象

 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Richard";
        one.showName();
        System.out.println("==========");

        //匿名对象
        new Person().name = "Mystics";
        new Person().showName(); //我叫null

    }
}
