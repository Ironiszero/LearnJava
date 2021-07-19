package com.company;
public class Outer {
    private double weight;
    public class OuterLeg{
        public void test(){
            System.out.println("test方法");
            System.out.println("weight的成员变量"+weight);
        }
    }
    public static class OuterHorn{
        public static void bar(){
            System.out.println("bar方法");
//            System.out.println(weight);
//            milk();
        }
         public void milk(){
            System.out.println("Cow can produce milk!");
         }
    }
    class A{
        class B{
        }
    }
    public static void main(String[] args){

    }
}
