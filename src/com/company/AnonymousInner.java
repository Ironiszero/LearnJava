package com.company;
 abstract class Animal{
    private double weight;
    public Animal(double weight){
        this.weight=weight;
    }
    public void walk(){
        System.out.println("Animal coubld move.");
    }
    public abstract void taste();
}

interface Printable{
//    下面两个方法前面的修饰符有public、abstract
//    接口提供的是一种规范，规范的东应该公开
//    暴露出来给大家遵守
     void print();
     void inputData();
}

public class AnonymousInner{
    public static void main(String[] args){
        Animal an=new Animal(8.9) {
            //            匿名内部类的类体部分
            {
                System.out.println("——初始化块——");
            }

            @Override
            public void taste(){
                System.out.println("rabit is good");
            }

            public void foo(){
                System.out.println("匿名类里面添加foo方法");
            }
        };
        an.taste();
        an.walk();
//        an的编译类型是Animal，对于编译阶段而言Animal没有foo（）方法；
//        编译器认为an（Aniaml类型）没有foo方法
//        an.foo();强制转换需要子类的类名
        Printable p=new Printable(){
//            类体部分，通常只要实现抽象方法即可
            @Override
            public void print(){
                System.out.println("Print data!");
            }
            @Override
            public void inputData(){
                System.out.println("Input data!");
            }
        };
        p.print();
        p.inputData();
    }
//    抽象方法不能创建实例
}
