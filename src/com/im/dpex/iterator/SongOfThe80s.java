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
import java.util.Arrays;
import java.util.Iterator;
public class SongOfThe80s implements SongIterator{
   
    
    SongInfo[] bestSong;
    int valuOfArray=0;
    
    public SongOfThe80s(){
        bestSong=new SongInfo[3];
        
        addSong("song11","band1",1981);
        addSong("song22","band2",1982);
        addSong("song33","band3",1983);
        addSong("song44","band4",1984);
        
    }
    public void addSong(String songName,String bandName,int yearOfRealease){
        SongInfo songInfo=new SongInfo(songName, bandName, yearOfRealease);
        bestSong[valuOfArray]=songInfo;
        valuOfArray++;
        
        
    }
    
//    public SongInfo[] getBestSong(){
//        return bestSong; 
//    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSong).iterator();
    }
    
}

    

