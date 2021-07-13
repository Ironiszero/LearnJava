package com.company;
class Goat{
    private String color;
    private double weight;
    public Goat(){

    }
    public Goat(String color,double weight){
        this.color=color;
        this.weight=weight;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return this.weight;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj!=null&&obj.getClass()==Goat.class){
            Goat target=(Goat)obj;
            return this.color.equals(color)&&this.weight==weight;
        }
        return false;
    }

}
public class Main{
    public static void main(String[] args){
        Goat goat1=new Goat("黑色",78.2);
        Goat goat2=new Goat("黑色",78.2);
        System.out.println(goat1==goat2);
//        goat1与goat2分别指向两个不同的对象，因此==返回false；
        System.out.println(goat1.equals(goat2));

    }
}