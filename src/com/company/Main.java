package com.company;
class Pig {
    private String color;
    private double weight;
    public Pig(){

    }
    public Pig(String color,double weight){

    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight(String color) {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public String toString(){
        return "Pig[color="+this.color+",weight="+this.weight+"]";
    }
}
public class Main {
    public static void main(String[] args){
        final Pig p=new Pig("小猪",88);
        p.setColor("黑色");
        p.setWeight(44.5);
        System.out.println(p);
    }

}