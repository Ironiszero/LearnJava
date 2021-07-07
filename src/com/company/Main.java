package com.company;
class Base {
    static{
        System.out.println("Base的类初始化块");
    }
    public Base() {
        System.out.println("Base的无参数构造器");
    }
    public Base(String name){
        System.out.println("Base的有参数的构造器");
    }
}
class Mixd extends Base{
    static{
        System.out.println("Mixd的类初始化块");
    }
    {
        System.out.println("Mixd的实例初始化块");
    }
    public Mixd(int age){
        this();
        System.out.println("Mixd的int构造器");
    }
    public Mixd(){
        super("fkit");
        System.out.println("Mixd的无参数构造器");
    }
}
class Sub extends Mixd{
    static {
        System.out.println("Sub的类初始化块");
    }
    {
        System.out.println("Sub的实例初始化块");
    }
    public Sub(){
        System.out.println("Sub的无参数构造器");
    }
    public Sub(double de){
        this();
        System.out.println("Sub的double构造器");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        new Sub(3.4);
        new Sub(1.0);
    }
}
