/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.command;

/**
 *
 * @author acer
 */
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {
        //--turn tv on
        ElectronicDevice newDevice=TvRemote.geDevice();
        
        TurnTvOn onCommand=new TurnTvOn(newDevice);
        
        DeviceButton onPressButton=new DeviceButton(onCommand);
        
        onPressButton.press();
       
        //----turn tv off
        
               
        TurnTvOff offCommand=new TurnTvOff(newDevice);
        
        DeviceButton offPressButton=new DeviceButton(offCommand);
        
        offPressButton.press();
        
        //------volume up
        
        TurnTvUp upCommand=new TurnTvUp(newDevice);
        
        DeviceButton upPressButton=new DeviceButton(upCommand);
        
        upPressButton.press();
        upPressButton.press();
        upPressButton.press();
        upPressButton.press();
        
        //------volume Down
        
        TurnTvDown DownCommand=new TurnTvDown(newDevice);
        
        DeviceButton downPressButton=new DeviceButton(DownCommand);
        
        downPressButton.press();
        
        //push array list
        
        Telivision tv=new Telivision();
        Radio radio=new Radio();
        
        List<ElectronicDevice> alldevices= new ArrayList<ElectronicDevice>();
        alldevices.add(tv);
        alldevices.add((ElectronicDevice) radio);
        
        TurnItAllOff turnOffDevices=new TurnItAllOff(alldevices);
        
        DeviceButton turnThemOff=new DeviceButton(turnOffDevices);
        turnThemOff.press();
        
        //-------
        turnThemOff.pressUndo();
    }
    
}
