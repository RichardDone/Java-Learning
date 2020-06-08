package cn.itcast.day06.demo03;
/*
定义person的年龄时无法阻止不合理的数值被设置进来。

用private关键字将需要保护的成员变量进行修饰
使用private进行修饰，本类当中仍然可以访问，但是超出本类范围后就不能直接访问了
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫" + name + "年龄是" + age);
    }
    public void setAge(int num){
       if(num<100 && num>0)
       {
           age = num;
       }
       else{
           System.out.println("数据不合理！");
       }
    }
    public int getAge(){
        return age;
    }
}
