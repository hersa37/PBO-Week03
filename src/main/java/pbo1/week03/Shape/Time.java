/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Shape;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Time {
    
    private final int SECOND;
    private final int MINUTE;
    private final int HOUR;
    
    private int second;
    private int minute;
    private int hour;
    
    public Time(){
        SECOND=0;
        MINUTE=0;
        HOUR=0;
        
        second=SECOND;
        minute=MINUTE;
        hour=HOUR;        
    }
    
    public Time(int second, int minute, int hour){
        SECOND=second;
        MINUTE=minute;
        HOUR=hour;
        
        this.second=SECOND;
        this.minute=MINUTE;
        this.hour=HOUR;        
    }
    
    public void setSecond(int second){
        this.second=second;
    }
    
    public int getSecond(){
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
