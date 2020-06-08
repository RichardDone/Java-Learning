package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "JAY";
//        person.age = 23;//直接访问private错误
        person.setAge(23);
        person.show();
    }
}
