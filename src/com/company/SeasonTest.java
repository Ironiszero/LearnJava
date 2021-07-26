package com.company;

public class SeasonTest {
    public static void main(String[] args){
        //枚举赋值，直接用已有实例赋值
        Season s1=Season.SPRING;
        System.out.println(s1.name());
        System.out.println(s1.ordinal());
        //返回所有枚举实例
        Season[] ss=Season.values();
        for(Season ei:ss){
            System.out.println(ei);
        }
//        该字符串代表了某个枚举实例的名字
        String str="SPRING";
//        根据字符串名字，返回对应的枚举实例
        Season st=Season.valueOf(str);
        System.out.println(st.ordinal());
        st.info();
    }
}
