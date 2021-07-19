package com.company;
public interface Walkable {
    //接口中的private方法
    default void foo(){
        System.out.println("foo方法");
    }
    public static void main(String[] args){
    }
    default void info(){
        foo();
    }
}
