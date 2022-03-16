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
    
    public Time(int hour, int minute, int second){        
        if(second>=0 && second<60){            
            this.second=second;
        } else this.second=0;
        if(minute>=0 && minute<60){
            this.minute=minute;
        } else this.minute=0;
        if(hour>=0 && hour<24){
            this.hour=hour;
        } this.hour=0;
            
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
        if(hour>=0 && hour<24){
            this.hour=hour;
        } this.hour=0;
    }
    
    public int getHour(){
        return hour;
    }
    
    public Time nextSecond(){
        second++;
        if(second==60){
            second=0;
            minute++;
        }
        if(minute==60){
            minute=0;
            hour++;
        }
        if(hour==24){
            hour=0;
        }
        
        return this;
    }
    
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
}
