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
public abstract class RemoteButton {
    private EntertainmentDevice theDevice;
    
    public RemoteButton(EntertainmentDevice newDevice){
        this.theDevice=newDevice;
        
    }
    //using implemented entertainment device method because in is common
    public void deviceFeedBack(){
        
        theDevice.deviceFeedBack();
    }
    
    public void buttonFivePress(){
        theDevice.buttonFivePress();
        }
    public void buttonSixPress(){
       theDevice.buttonSixPress();
    }
    
    public abstract void buttonNine();//another Abstract method 
    
}
