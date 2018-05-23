/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.iterator;

/**
 *
 * @author acer
 */
public class RadioStation {
    public static void main(String[] args) {
        SongOfThe70s song70s=new SongOfThe70s();
        SongOfThe80s song80s=new SongOfThe80s();
        SongOfThe90s song90s=new SongOfThe90s();
        
        
        DiscJocky madeMike=new DiscJocky(song70s, song80s, song90s);
        madeMike.showTheSong2();
    }
    
}
