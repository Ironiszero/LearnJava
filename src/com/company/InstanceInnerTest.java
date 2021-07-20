package com.company;
public class InstanceInnerTest {
    public static void main(String[] args) {
//      声明变量：外部类.内部类 变量名
// 声明变量不属于主动使用
        InstanceInner.Inner in;
//      外部类的实例
        InstanceInner ii = new InstanceInner();
//      创建对象：宿主.new 非静态内部类构造器(参数);
         in = ii.new Inner(2);
    }
}

