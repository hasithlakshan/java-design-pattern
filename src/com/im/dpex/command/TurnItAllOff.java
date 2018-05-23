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
import java.util.List;

public class TurnItAllOff implements Command{
    
    List<ElectronicDevice> theDevices;
    
    public TurnItAllOff(List<ElectronicDevice> newDevices){
        this.theDevices=newDevices;
    }

    @Override
    public void execute() {
        for(ElectronicDevice devices:theDevices){
            devices.off();
        }
    } 

    @Override
    public void undo() {
        for(ElectronicDevice devices:theDevices){
            devices.on();}
    
    }
}
