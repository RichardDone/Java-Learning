package cn.itcast.day05.demo01;
/*
静态初始化

标准格式：数据类型[] 数组名 = new 数据类型[] {元素1，元素2，.....}

省略格式：数据类型[] 数组名 = {元素1，元素2，.....}

注意事项：
1.静态初始化没有指定长度，但是会自动推算长度
2.静态初始化标准格式可以拆分成两个步骤
 */
public class Demo03Array {
    public static void main(String[] args) {
        // 静态初始化 省略格式
        int[] arrayA = {10,20,30};
        // 静态初始化标准格式 拆分
        int[] arrayB;
        arrayB = new int[]{11,21,31};
        // 动态初始化标准格式 拆分
        int[] arrayC;
        arrayC = new int[5];
        // 静态初始化的省略格式 不能拆分
//        int[] arrayD;
//        arrayD = {10,20,30};


    }
}
