package com.company;
public class StaticInner {
    public static class Inner{
        private int age;
        public Inner(){

        }
        public Inner(int age){
            this.age=age;
        }
        @Override
        public String toString(){
            return "Inner[age="+this.age+"]";
        }
        public void inTest(){
            System.out.println("静态内部类的测试方法");
        }
        public static int sum(int a,int b){
            return a+b;
        }
    }
    public static void main(String[] args){

    }

}
