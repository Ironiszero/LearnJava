package com.company;
public interface Eatable{
    int MAX_PRESERVE=100;
    void test1();
    public static void main(String[] args){
        System.out.println("Hello World");
        info();
        System.out.println(info1("info类方法"));
    }
    static void info(){
        System.out.println("info类方法");
    }
    static String info1(String s){
        return s;
    }

}