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
public class TvRemotePause extends RemoteButton{
     public TvRemotePause(EntertainmentDevice newDeiivce){
        super(newDeiivce);
        
        
    }

    @Override
    public void buttonNine() {
        System.out.println("the tv is pause");
    }
    
    
}
