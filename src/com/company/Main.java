package com.company;
class A{
    public final String info(){
        System.out.println("info方法");
        return "info";
    }
    public final String info(String s){
        System.out.println("带String的info方法");
        return "info of String";
    }
}
public class Main extends A{
    public static void main(String[] args) {
    }
//        @Override
//        public void info(){
//            System.out.println("子类重写info方法");
//        }
    public void test(){
        this.info();
    }
}