package com.company;
@FunctionalInterface
interface Movable{
    void move();
    static int sun(int a,int b){
        return a+b;
    }
    default void foo(){
        System.out.println("foo方法");
    }
}
public class LambdaTest {
    public static void main(String[] args){
        Movable mov=new Movable(){
//           类体，通常就是实现抽象方法
            @Override
            public void move(){
                System.out.println("The car is running fast!");
            }
        };
//        mov的编译类型是Movable，Movable中声明了几个方法
//        就可以调用几个方法
        mov.move();
        mov.foo();
//        Lambda表达式,与上面匿名内部类语法的本质是相同的。
        Movable mov2=() ->{
            System.out.println("the car is fast!");
        };
        mov2.move();
        mov2.foo();
    }
}
