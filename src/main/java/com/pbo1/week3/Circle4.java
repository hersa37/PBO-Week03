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
public class Circle4 {
    
    private double radius;
    private double xPosition;
    private double yPosition;
    private String color;
    
    public Circle4() {
        radius=0;
        color="";
    }
    
    public Circle4(double xPosition, double yPosition){
        this.xPosition=xPosition;
        this.yPosition=yPosition;
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
    
    public double moveHorisontal(double distance){
        xPosition+=distance;
        return xPosition;
    }
    
    public double moveVertical(double distance){
        yPosition+=distance;
        return yPosition;
    }
    public String toString(){
        return "Radius\t\t "+radius
                +"\nColor\t\t: "+color
                +"\nx position\t: "+xPosition
                +"\ny position\t: "+yPosition;
    }
}
