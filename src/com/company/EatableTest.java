package com.company;

public class EatableTest {
    public static void main(String[] args){
        System.out.println(Eatable.MAX_PRESERVE);
        Eatable.info();
        Eatable e1=new Dog();//向上转型；
        Eatable e2=new PigLegRice();
//        向上转型；
//        接口类型的变量，只能用实现类的实例赋值
        if(e1 instanceof Dog){
            Dog dg=(Dog)e1;
            dg.move();
        }
    }
}
