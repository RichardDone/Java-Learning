package cn.itcast.day06.demo04;
/*
构造方法是专门用来创建对象的方法
new其实就是构造方法
public 类名称（参数类型 参数名称）{
    方法体
}

注意事项：
1.构造方法的名称必须和所在的类名称完全一样，大小写也要一样
2.构造方法，不写返回值类型，void都不写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，编译器会赠送一个构造方法，无参数，什么都不做
5.一旦编写至少一个构造方法，编译器不再赠送
6.构造方法可以进行重载。方法名相同，参数不同
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参数构造方法执行!");
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("全参数构造方法执行!");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
