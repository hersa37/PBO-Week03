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
    
    //Attributes
    private int second;
    private int minute;
    private int hour;
    
    public Time(){
        this(0, 0, 0);
    }
    
    public Time(int second, int minute, int hour){        
        this.second=second;
        this.minute=minute;
        this.hour=hour;        
    }
    
    public void setSecond(int second){
        if(second>=0 && second<60){            
            this.second=second;
        } else this.second=0;
            
    }
    
    public int getSecond(){
        return second;
    }
    
    public void setMinute(int minute){
        if(minute>=0 && minute<60){
            this.minute=minute;
        } else this.minute=0;
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
    
    public void nextSecond(){
        second++;
        if(second==60){
            second=0;
            minute++;
        }
        if(minute==60){
            minute=0;
            hour++;
        }
    }
    
    @Override
    public String toString(){
        return "Second\t: "+second
                +"\nMinute\t: "+minute
                +"\nHour\t: "+hour;
    }
}
