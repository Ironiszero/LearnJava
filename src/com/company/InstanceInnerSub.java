package com.company;

public class InstanceInnerSub extends InstanceInner.Inner {
    public InstanceInnerSub(){
        new InstanceInner().super(2);
    }
    public static void main(String[] args){

    }

}
