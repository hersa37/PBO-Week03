/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package com.pbo1.figure;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle4{
    
    private Circle2 circle2;
    private Circle3 circle3;
    
    public void moveHorisontal(double distance){
        circle3.setXPosition(circle3()+distance);
    }
    
    public void moveVertical(double distance){
        setYPosition(getXPosition()+distance);
    }
}
