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
public class TvDevice extends EntertainmentDevice {
    public TvDevice(int newDeviceState,int newmaxSetting){
        this.deviceState=newDeviceState;
        this.maxsetting=newmaxSetting;
        
    }

    @Override
    public void buttonFivePress() {
        System.out.println("chanel down");
        deviceState--;
    }

    @Override
    public void buttonSixPress() {
        System.out.println("chanel up");
        deviceState++;
    }
    
}
