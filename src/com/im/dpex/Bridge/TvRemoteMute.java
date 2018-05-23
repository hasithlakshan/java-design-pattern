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
public class TvRemoteMute extends RemoteButton{
    
    
    public TvRemoteMute(EntertainmentDevice newDeiivce){
        super(newDeiivce);
        
        
    }
//acording to mute tv
    @Override
    public void buttonNine() {
        System.out.println("the tv is mute");
    }
    
}
