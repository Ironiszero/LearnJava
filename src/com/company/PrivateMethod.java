package com.company;
public interface PrivateMethod {
    //    default方法的本质就是实例方法
    default void fly(){
        System.out.println("flying!");
        movestep();
    }
    //    default方法的本质就是实例方法
    default void go(){
        System.out.println("going!");
        movestep();
    }
//    该方法本来只是一个工具方法，这个工具方法的作用只用于为该类中其他方法提供帮助
//    该方法并不希望暴露给外部调用，因此该方法希望被隐藏起来。
//    default void movestep(){
    default void movestep(){
        for(int i=0;i<10;i++){
            System.out.println("move step!");
        }
    }
    public static void main(String[] args){
    }
}
