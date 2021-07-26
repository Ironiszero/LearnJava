package com.company;
public enum Gender {
//    第一行实际上要创建、并列出枚举类的所有实例
    MALE(){
//    匿名内部类的类体部分
    @Override
    public void info(){
        System.out.println("I am a male.");
    }
},
    FEMALE(){
//    匿名内部类的类体部分
    @Override
    public void info(){
        System.out.println("I am a FEMALE.");
    }
    };
    private String desc;
   /* Gender(String desc){
        this.desc=desc;
    }*/
    abstract void info();
    public static void main(String[] args){

    }
//
}
