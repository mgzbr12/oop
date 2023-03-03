package day01;

import java.util.Arrays;

/**
 *  排序
 */
public class Sort {
    String name;
    //定义一个方法，void表示方法没有返回值
    void say(){
        this.name = "";
        System.out.println("Hallo");
    }
    //方法定义一个参数
    void hallo(String name){
        this.name = name ;
        System.out.println("My name is " + this.name);
    }
    //定义两个参数，计算两个整数的和，返回计算结果
    int sum (int num1 , int num2){
        //计算两个数的和
        int s = num1 + num2 ;
        //返回计算的结果
        return num1 + num2;


    }

    public static void main(String[] args) {
        /*
        创建一个对象，调用方法，调用有参方法，调用有返回值的方法
        定义一个变量来接收返回值
         */
        Sort sort2 = new Sort();
        sort2.hallo("Jerry");

    }
    //数组排序（冒泡排序），一个数组类型的参数，没有返回值
    void bubble (int[] arr){
        System.out.println("排序前：" + Arrays.toString(arr));
        for (int i =0 ; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - i -1 ; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
          }
        System.out.println("排序后：" + Arrays.toString(arr));
    }
}
