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
public class TestRemote {
    public static void main(String[] args) {
        
        RemoteButton Tv=new TvRemoteMute(new TvDevice(1, 200));
        RemoteButton Tv1=new TvRemotePause(new TvDevice(2, 200));
        
        System.out.println("mute tv");
        Tv.buttonFivePress();
        Tv.buttonSixPress();
        Tv.buttonNine();
        
        System.out.println("pause tv");
        
        Tv1.buttonFivePress();
        Tv1.buttonSixPress();
        Tv1.buttonNine();
        Tv1.deviceFeedBack();
    }
    
}
