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
import java.util.Hashtable;
import java.util.Iterator;
public class SongOfThe90s implements SongIterator{
   
    
    Hashtable<Integer, SongInfo> bestSong=new Hashtable<>();
    int hashKey=0;
    
    public SongOfThe90s(){
         
        addSong("song91","band1",1991);
        addSong("song92","band2",1992);
        addSong("song93","band3",1993);
        addSong("song94","band4",1994);
        
    }
    public void addSong(String songName,String bandName,int yearOfRealease){
        SongInfo songInfo=new SongInfo(songName, bandName, yearOfRealease);
        bestSong.put(hashKey, songInfo);
        hashKey++;
        
        
        
    }
    
//    public Hashtable<Integer, SongInfo> getBestSong(){
//        return bestSong; 
//    }

    @Override
    public Iterator createIterator() {
        return bestSong.values().iterator();
    }
    
}
