package day01;

/**
 * 有参参数构造方法
 */
public class demo03 {
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
    public Student (String name , int age){//有参构造方法：形式参数

        this.name = name ;
        this.age = age;

    }

}
