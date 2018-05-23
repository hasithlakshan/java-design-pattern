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
public class TurnTvOn implements Command{
    
    ElectronicDevice electronicDevice;
    
    public TurnTvOn(ElectronicDevice newdevice){
       this.electronicDevice=newdevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    
    }

    @Override
    public void undo() {
        electronicDevice.off();
    }
    
}
