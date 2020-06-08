package cn.itcast.day06.demo02;

public class Demo01PhoneOne {
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
    }
}
