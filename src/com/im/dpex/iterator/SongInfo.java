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
public class SongInfo {
    private String songName;
    private String bandName;
    private int yearOfRelease;
    
    public SongInfo(String newSongName,String newBandName,int newYearOfRelease){
        this.songName=newBandName;
        this.bandName=newBandName;
        this.yearOfRelease=newYearOfRelease;
        
    }
    
    public String getSongName() {
        return songName;
    }
  
    public String getBandName() {
        return bandName;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    
}
