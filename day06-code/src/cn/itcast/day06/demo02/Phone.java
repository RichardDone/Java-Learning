package cn.itcast.day06.demo02;
/*
定义手机类

属性：品牌、价格、颜色
行为：打电话、发短信

成员变量（属性）：
   String brand;
   double price;
   String color;
成员方法（行为）：
    public void call(String who){};
    public void sendMessage(){};
 */
public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
