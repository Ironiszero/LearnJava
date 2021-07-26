package com.company;

@FunctionalInterface
interface Wawa{
    void wa(String name,int age);
}
@FunctionalInterface
interface Movable{
    void move(double distance);
}
@FunctionalInterface
interface Fn{
    int cal(int n);
}
public class LambdaTest {
    public static void main(String[] args){
                Wawa wa=(String name,int age)->{
//        只要所实现的抽象方法的形参列表和方法体
            System.out.println("重写wa方法");
            System.out.println("name参数:"+name);
            System.out.println("age参数:"+age);
        };
        wa.wa("string",78);

        Movable mv=distance-> System.out.println("重写Movable方法");
        mv.move(1.2);
        Fn fn1=n->{
            return n*n;
        };
        System.out.println(fn1.cal(67));
    }
}
