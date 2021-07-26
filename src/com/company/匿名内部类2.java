package com.company;
interface Eatable{
    void taste();
    String sayHi(String name);
}
public class 匿名内部类2 {
    public static void main(String[] args){
//        实现Eatable接口创建匿名内部类、同时还创建实例（Eatble匿名内部类的实例）
//        Object ob =new Eatable()
        Eatable ea=new Eatable(){
//      匿名内部类的类体部分；
//      类体部分通常只是实现抽象方法；
            @Override
            public void taste(){
                System.out.println("The apple is good to eat.");
            }
            @Override
            public String sayHi(String name){
                System.out.println("Excute the way of sayHi");
                return name+"Hi";
            }
        };
//        ea的编译类型是Object
//        ea.taste();
//        ea的编译类型是Eatable,Eatable有taste方法，因此编译通过
        ea.taste();
//        对于调用有返回值的方法，第一种处理思路：用变量去接收返回值。
        String str=ea.sayHi("fkjava");
        System.out.println(str);
//        对于调用有返回值的方法，第二种处理思路，直接使用该返回值
        String str2="hhhhh"+ea.sayHi("java");
        System.out.println(ea.sayHi("java"));


    }

}
