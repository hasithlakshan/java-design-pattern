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
public class Radio implements ElectronicDevice{
    private int volume=0;
    
    
    @Override
    public void on() {
        System.out.println("radio is on");
    }

    @Override
    public void off() {
        System.out.println("radio is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("radio volume at"+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("radio volume at"+volume);
     }
    
    
    
    
}
