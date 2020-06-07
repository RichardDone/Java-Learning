package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 35, 46};

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
