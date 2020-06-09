package cn.itcast.day07.demo04;
/*
定义一个数组存储三个Person对象

数组有一个缺点，一旦创建程序运行期间长度不可以发生改变
 */
public class Demo01Array {

    public static void main(String[] args) {
        Person[] array = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("Richard",19);
        Person two = new Person("Mystics",22);
        Person three = new Person("Ignite",23);

        //将one中的地址值赋值到数组的0号元素
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());
    }
}
