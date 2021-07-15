package com.company;
public class Main{
    public static void main(String[] args){
//        有final修饰，指定了初始值，即初始值在编译的时候就可以确定
        final int MAX=100;
        System.out.println(MAX);
        String str1="fkjava";
        String str2="fkjava";
        System.out.println(str1==str2);
        String str3="fkit.org";
        String str4="fkit"+".org";
        System.out.println(str3==str4);
        final String str5="fkit";
        final String str6=".org";
        String str7=str5+str6;
        System.out.println(str7==str3);
//        下面代码有几个变量，几个对象？0个变量，1个对象；
        final String s1="fkit";
        final String s2=s1+".org";
        final String s3=s2+" is ";
        final String s4=s3+" a very";
        final String s5=s4+" good education center!";
        System.out.println(s5);
    }
}