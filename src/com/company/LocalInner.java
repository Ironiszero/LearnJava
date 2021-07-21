package com.company;

public class LocalInner {
    public static void main(String[] args){

    }
    public void a(){
//        局部内部类
        class In{
            static final int age=20;
        }
        In in=new In();
    }
    public void b(){
//        局部内部类
        class In{

        }
    }
}
