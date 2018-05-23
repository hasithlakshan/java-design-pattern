/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oopex.inheritance;

/**
 *
 * @author acer
 */
public class Lecturer extends Person{
    private double hourlyRate;
    
    
    public void paySalary(){
    }    

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate>0){//data validation
             this.hourlyRate = hourlyRate;
            
        }
    
       
    }
    public String getTp() {//method overiding
        return super.getTpLecture();
    }
    
}
