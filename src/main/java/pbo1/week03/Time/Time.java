/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Time;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Time {
    //Constants
    private final int SECOND=0;
    private final int MINUTE=0;
    private final int HOUR=0;
    //Attributes
    private int second;
    private int minute;
    private int hour;
    
    public Time(){
//        this(0, 0, 0);
        second=SECOND;
        minute=MINUTE;
        hour=HOUR;
    }
    
    public Time(int second, int minute, int hour){        
        this.second=second;
        this.minute=minute;
        this.hour=hour;        
    }
    
    public void setSecond(int second){
        if(second>=0){
            minute+=(int)(second/60);
            this.second=second%60;
        }    
            
    }
    
    public int getSecond(){
        return second;
    }
    
    public void setMinute(int minute){
        if(minute>=0){
            hour+=(int)(minute/60);
            this.minute=minute%60;
        }
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
    
    @Override
    public String toString(){
        return "Second\t: "+second
                +"\nMinute\t: "+minute
                +"\nHour\t: "+hour;
    }
}
