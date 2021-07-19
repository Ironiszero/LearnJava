package com.company;

public abstract class Main{
    private int age;
    public Main(){

    }
    public Main(int age){
        this.age=age;
    }
    public abstract void move();
    public static void info(){
        System.out.println("iiiiiii");
    }
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
