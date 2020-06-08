package cn.itcast.day06.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        person.name = "JAY";
        person.sayHello("RICHARD");
    }
}
