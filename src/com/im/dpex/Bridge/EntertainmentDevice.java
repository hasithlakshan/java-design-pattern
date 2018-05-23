/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.Bridge;

/**
 *
 * @author acer
 */
abstract class EntertainmentDevice {
    public int deviceState;
    public int maxsetting;
    public int volumeLevle=0;
    
    public abstract void buttonFivePress();
    public abstract void buttonSixPress();
    
    
    
    public void deviceFeedBack(){
        
        if(deviceState>maxsetting|| deviceState<0){
            deviceState=0;
            System.out.println("on:"+deviceState);
            
        }
        System.out.println("on:"+deviceState);
    }
    
    public void buttonSevenPress(){
        volumeLevle++;
        System.out.println("volume level at:"+volumeLevle);
    }
    public void buttonEightPress(){
        volumeLevle--;
        System.out.println("volume level at:"+volumeLevle);
    }
    
}
