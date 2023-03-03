package day01;

/**
 * 对类，是对一类事物的抽象描述
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("hallo cat");
        System.out.println("Hallo Cat");

        //创建一个猫类的对象
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.type = "橘猫";//给对象的属性赋值
        cat1.age = 3;
        cat1.color = "橘色";
        cat1.gender = "母猫";

        cat2.type = "缅因猫";
        cat2.age = 5;
        cat2.color = "黑白相间0";
        cat2.gender = "公猫";



        System.out.println("第一只猫的品种：" + cat1.type);//访问对象的属性
        System.out.println("第二只猫的品种：" + cat2.type);

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
    int age;//猫的年龄
    String color;//猫的颜色
    String gender;//猫的性别

    //声明一个构造方法（构造器）
    public Cat(){
        type = "橘猫";
        age = 3;
        color = "橘色";
        gender = "母猫";
    }
}
