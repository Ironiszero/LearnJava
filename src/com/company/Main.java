package com.company;
class Main{
    public static void main(String[] args){
        //int i=null;//基本类型不接受null值
        Integer in=2;//2可以自动装箱成Integer
        Object ob=2.3;//2.3自动装箱double，double向上转型为Object
        Boolean b=true;//自动装箱
        Long lg=3L;//自动装箱
        Long result=in*lg;
        System.out.println(result);
        String str="2345";
       // int i=Integer.parseInt(str);
        //System.out.println(i);
        long lo=Long.parseLong(str);//parse解析
        System.out.println(lo);
        String str3="true";
        boolean b1=Boolean.parseBoolean(str3);
        System.out.println(b1);
       // String s4="3a13";
        //System.out.println(Integer.parseInt(s4));
        Integer i=20;
        Integer j=20;
        System.out.println(i==j);//在-128~127之间是关联的；
        Integer k=200;
        Integer l=200;
        System.out.println(k==l);
    }
}
