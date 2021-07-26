package com.company;
abstract class Animal{
    private double weight;
    public Animal(double weight){
        this.weight=weight;
    }
    public abstract void move();
    public void info(){
        System.out.println("This is a animal");
    }

}
public class 匿名内部类1 {
    public static void main(String[] args){
//        继承Animal抽象父类来创建匿名内部类，同时还创建实例（Animal匿名子类的实例）
        Animal ob=new Animal(2.3){
            //            这行代码为什么会执行
//            初始化块：每次创建对象时，先执行实例初始化块，再执行构造器的代码

            {
                System.out.println("执行初始化块");
            }
            @Override
            public void move(){
                System.out.println("Animal is running");
            }
//            为什么一定要重写抽象方法，继承他的父类，就必须
//            因为要实现他所有的抽象方法，
//            匿名内部类就没有用extends
//            匿名类中额外增加的方法只能通过反射调用，因此一般不会添加；
            public void test(){
                System.out.println("test()方法");
            }
        };
//        ob的编译类型是Animal,Animal有move方法
        ob.move();
//        ob的编译类型是Animal,Animal有move方法
        ob.info();
//        ob的编译类型是Animal，Animal没有test方法，test是对匿名内部类加的；
//        ob.test();
    }
}
