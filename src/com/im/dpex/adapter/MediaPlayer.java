/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.adapter;

/**
 *
 * @author acer
 */
public class MediaPlayer implements Player{

    @Override
    public void playMedia(String name) {
        System.out.println("playing -media player "+name);
    }

    @Override
    public void playVLC(String name) {
    }
    
}
