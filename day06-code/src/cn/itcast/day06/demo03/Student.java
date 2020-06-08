package cn.itcast.day06.demo03;
/*
对于基本类型当中的boolean值，get一定要使用isXxx的形式
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
}
