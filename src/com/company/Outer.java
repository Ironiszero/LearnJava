package com.company;
public class Outer{
    private int len=20;
    private class OuterTail{
        int len=200;
        public void info(){
            int len=2000;
            System.out.println("len:"+len);
            System.out.println("len:"+this.len);
            System.out.println("len:"+Outer.this.len);
        }
    }
    public void test(){
        OuterTail ot =new OuterTail();
        ot.info();

    }
    public static void main(String[] args){
        Outer ou =new Outer();
        ou.test();
    }
}
