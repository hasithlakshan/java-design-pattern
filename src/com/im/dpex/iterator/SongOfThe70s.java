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
import java.util.ArrayList;
import java.util.Iterator;
public class SongOfThe70s implements SongIterator{
    
    ArrayList<SongInfo> bestSong;
    
    public SongOfThe70s(){
        bestSong=new ArrayList<SongInfo>();
        
        addSong("song1","band1",1971);
        addSong("song2","band2",1972);
        addSong("song3","band3",1973);
        addSong("song4","band4",1974);
        
    }
    public void addSong(String songName,String bandName,int yearOfRealease){
        SongInfo songInfo=new SongInfo(songName, bandName, yearOfRealease);
        bestSong.add(songInfo);
        
    }
    
//    public ArrayList<SongInfo> getBestSong(){
//        return bestSong; 
//    }

    @Override
    public Iterator createIterator() {
        return  bestSong.iterator();
    }

    
    
}
