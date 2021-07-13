package com.company;
class Apple extends Object{
    private String color;
    private double weight;
    public Apple(){
    }
    public Apple(String color,double weight){
        this.color=color;
        this.weight=weight;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Apple[color]=color"+color+",weight="+weight+"]";//列出所有的成员变量；
    }
}
public class Main {
    public static void main(String[] args){
        Apple ap=new Apple("红色",2.3);
//        下面两行代码完全相同
        System.out.println(ap);
        System.out.println(ap.toString());
        Apple ap2=new Apple("lv",1.7);
        System.out.println(ap2);
//        String str=ap2;
//        任何对象加上”“，就会变成字符串
        String str=ap2+"";
        System.out.println(str);
    }
}