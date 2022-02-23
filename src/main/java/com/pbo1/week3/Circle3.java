/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package com.pbo1.week3;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle3 {
    private double radius;
    
    private double xPosition;
    private double yPosition;
    private String color;
    
    public Circle3() {
        radius=20;
        xPosition=100;
        yPosition=100;
        color="black";
    }
    
    public Circle3(double radius, double xPosition, double yPosition, String color){
        this.radius=radius;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.color=color;
    }
    
    public void setRadius(double newRadius){
        radius=newRadius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setXPosition(double newXPosition){
        xPosition=newXPosition;
    }
    
    public double getXPosition(){
        return xPosition;
    }
    
    public void setYPosition(double newYPosition){
        yPosition=newYPosition;
    }
    
    public double getYPosition(){
        return yPosition;
    }
    
    public void setColor(String newColor){
        color=newColor;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    } 
    
    public String toString(){
        return "Radius\t\t "+radius
                +"\nColor\t\t: "+color
                +"\nx position\t: "+xPosition
                +"\ny position\t: "+yPosition;
    }
}
