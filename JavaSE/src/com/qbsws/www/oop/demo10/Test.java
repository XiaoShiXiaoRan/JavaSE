package com.qbsws.www.oop.demo10;

public class Test {
    public static void main(String[] args){
        //没有名字初始化类，不用讲实例保存到变量中~
        new Apple().eat();

        UserService userService= new UserService(){

            @Override
            public void hello() {
                //匿名内部类
            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}
interface UserService{
    void hello();
}