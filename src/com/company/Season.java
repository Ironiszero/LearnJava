package com.company;
import java.util.*;
public enum Season{
    SPRING,SUMMER,AUTUMN,WINTER;
    private Season(){
    }
    public void info(){
        System.out.println("info方法");
//        this代表该方法的对象——对象是season类型
        switch(this){
            case SPRING:
                System.out.println("spring");
                break;
            case AUTUMN:
                System.out.println("autumn");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }
    public static void main(String[] args){

    }
}