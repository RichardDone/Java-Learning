package cn.itcast.day04.demo02;

/*
注意事项：
1.方法定义先后顺序无所谓
2.方法不允许嵌套
3.方法不会主动执行，需要调用
*/

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public  static  void printMethod(){
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
