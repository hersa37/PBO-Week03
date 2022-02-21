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
public class Time {
    
    private double second;
    private int minute;
    private int hour;
    
    public void setSecond(double second){
        this.second=second;
    }
    
    public double getSecond(){
        return second;
    }
    
    public void setMinute(int minute){
        this.minute=minute;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public void setHour(int hour){
        this.hour=hour;
    }
    
    public int getHour(){
        return hour;
    }
    
    public String toString(){
        return "Second\t\t "+second
                +"\nMinute\t: "+minute
                +"\nHour\t: "+hour;
    }
}
