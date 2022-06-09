package com.qbsws.www.method;


/*
	我们一直在使用构造方法，但是，我们确没有定义构造方法，用的是哪里来的呢?

	构造方法的注意事项:
		A:如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
		B:如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
			注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。建议永远自己给出无参构造方法

	给成员变量赋值有两种方式：
		A:setXxx()
		B:构造方法
*/
//同一个包内方法名不能重复
//类
class Student2{
    private String name;
    private int age;


    /**
     *
     */
    public Student2(){
        System.out.println("这是无参构造方法");
    }
    //构造方法的重载格式
    /**
     * @author 🐖万鹏
     * @version 版本号
     * @since 1.8
     * @param name 姓名
     * @return 返回值情况
     */
    public Student2(String name){
        System.out.println("这是带一个String类型的构造方法");
        this.name = name;


    }

    /**
     * @author 🐖万鹏
     * @version 版本号
     * @since 1.8
     * @param age 年龄
     * @return 返回值情况
     */
    public Student2(int age){
        System.out.println("这是带一个int类型的构造方法");
        this.age = age;
    }
    /**
     * @author 🐖万鹏
     * @version 版本号
     * @since 1.8
     * @param name 姓名
     * @param age 年龄
     * @return 返回值情况
     */
    public Student2(String name,int age){
        System.out.println("这是一个带多个参数的构造方法");
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(name+"----"+age);
    }

}

/**
 * @param
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建对象
        Student2 s = new Student2();
        s.show();
        System.out.println("-------------");
        //创建对象2
        Student2 s2 = new Student2("朱万鹏大帅逼");
        s2.show();
        System.out.println("-------------");
        //创建对象3
        Student2 s3 = new Student2(20);
        s3.show();
        System.out.println("-------------");
        //创建对象4
        Student2 s4 = new Student2("🐖万鹏",20);
        s4.show();
    }
}
