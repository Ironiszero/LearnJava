package com.company;

public enum Orientation {
//    枚举的第一行并不是简单的列出枚举实例；
//    他们实际上是4个public static final修饰的常量；
//    因此第一行其实创建、并列出枚举类的所有实例
    EAST()/*调用无参数的构造器*/,SOUTH("南")/*调用带String参数的构造器*/,WEST(),NORTH("北");
   private String desc;
   Orientation(){

   }
    Orientation(String desc){
        this.desc=desc;
    }
    @Override
    public String toString(){
        return "Orientation[desc="+this.desc+"]";
    }
    public static void main(String[] args){

    }
}
