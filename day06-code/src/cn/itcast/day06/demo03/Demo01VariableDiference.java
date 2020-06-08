package cn.itcast.day06.demo03;
/*
局部变量和成员变量

局部：定义在方法的内部。在方法内使用。无默认值，必须手动赋值。

成员：方法的外部，直接写在类当中。类中均可使用。有默认值，规则和数组一样。

两者内存的位置不同。
局部变量位于栈内存
成员变量位于堆内存

生命周期不同
局部变量随着方法进栈诞生，出栈消失
成员变量随着对象创建诞生，随着对象被垃圾回收消失

 */
public class Demo01VariableDiference {
    String name; //成员变量
    public void methodA(){
        int num = 20; //局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){ //方法的参数就是局部变量
        // 参数在方法调用的时候必然会被赋值的。
        System.out.println(param);
        int age;
//        System.out.println(num); //错误使用
        System.out.println(name);
//        System.out.println(age);//方法内的局部变量必须赋值。
    }
}
