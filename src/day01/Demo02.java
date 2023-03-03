package day01;

/**
 * 对类，是对一类事物的抽象描述
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("hallo cat");

    }
}
/**
 *
 * 一个Java程序中可以出现多个class，但是只能有一个public
 * 例子：定义一个猫类，用class关键词来修饰
 * 类名要符合Java命名的规则，类名单词开头要大写
 *
 */
class Cat{//建立一个猫类，然后定义属性
    String type ;//猫的类型
    int ane;//猫的年龄
    String color;//猫的颜色
    String gender;//猫的性别
}
