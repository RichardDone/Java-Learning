package cn.itcast.day06.demo02;

public class Demo03PhoneSame {
    public static void main(String[] args) {
        //根据Phone类创建对象
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        System.out.println("=============");

        one.brand = "Apple";
        one.color = "Black";
        one.price = 3499;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("=============");

        one.call("Steven Jobs");
        one.sendMessage();
        System.out.println("=============");


        //根据Phone类创建对象,shift + f6 选定统一重命名
        //讲one当中的地址值赋值给two 两个对象引用指向同一个对象空间
        Phone two = one;
        System.out.println(two.brand); //Apple
        System.out.println(two.color); //black
        System.out.println(two.price); //3499

        System.out.println("=============");

        two.brand = "Samsung";
        two.color = "bule";
        two.price = 5999;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("=============");

        two.call("Korean");
        two.sendMessage();
    }
}
