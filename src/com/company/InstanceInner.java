package com.company;
public class InstanceInner {
    public class Inner{
        public final static int MAX=100;
        private int age;
        public Inner(int age){
            this.age=age;
        }
        public void inTest(){
            System.out.println("非静态内部类的测试方法");
        }
    }

    public static void main(String[] args){

    }
}
