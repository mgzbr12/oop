package day01;

/**
 * 有参,参数构造方法
 * Java程序默认给每个类提供一个默认的构造方法（没有参数的构造方法）
 * Java一旦定义了一个构造方法，系统就不再提供默认的构造方法
 * 在一个类中可以提供多个参数不同的构造方法，称为构造方法的重载
 * 参数不同是指：参数个数和参数类型，至少有一个不同
 */
public class Demo03 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",20);
        System.out.println(stu1.name + "," + stu1.age);


        Student stu2 = new Student("李四" ,21);
        System.out.println(stu2.name + "," + stu2.age);


    }
}
//创建一个学生类
class Student {
    String name;
    int age;
    //默认的构造方法
    public Student (){

    }

    //有参构造方法：形式参数
    public Student (String name , int age){
        this.name = name ;
        this.age = age;

    }

}
