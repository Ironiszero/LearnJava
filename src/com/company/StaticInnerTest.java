package com.company;
public class StaticInnerTest {
    public static void main(String[] args){
//        外部类.内部类 变量名
        StaticInner.Inner in=new StaticInner.Inner(2);
        in.inTest();
       System.out.println("调用结果为："+StaticInner.Inner.sum(2,5));
    }
}
