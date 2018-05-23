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
public class TurnTvOff implements Command{
    
    
    ElectronicDevice electronicDevice;
    
    public TurnTvOff(ElectronicDevice newdevice){
       this.electronicDevice=newdevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    
    }
    
    @Override
    public void undo() {
        electronicDevice.on();
    }
    
}

    

