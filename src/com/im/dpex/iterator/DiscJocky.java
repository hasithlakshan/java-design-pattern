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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Enumeration;
public class DiscJocky {
    SongOfThe70s songOfThe70s;
    SongOfThe80s songOfThe80s;
    SongOfThe90s songOfThe90s;
    
    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;
    
    public DiscJocky(SongIterator newSongOfThe70s,SongIterator newSongOfThe80s,SongIterator newSongOfThe90s){
        this.iter70sSongs=newSongOfThe70s;
        this.iter80sSongs=newSongOfThe80s;
        this.iter90sSongs=newSongOfThe90s;
    
    }
    
    public void showTheSong(){
        ArrayList<SongInfo> alsong=songOfThe70s.getBestSong();
        System.out.println("song of 70");
        for(int i=0;i<alsong.size();i++){
            SongInfo bestSong=(SongInfo) alsong.get(i);
            System.out.println("song name"+bestSong.getSongName());
            System.out.println("song band"+bestSong.getBandName());
            System.out.println("song year"+bestSong.getYearOfRelease());
            
        }
        //-------array
        
        SongInfo[] array80song=songOfThe80s.getBestSong();
        System.out.println("song of 80");
        for(int i=0;i<array80song.length;i++){
            
            SongInfo bestSong=array80song[i];
            System.out.println("song name"+bestSong.getSongName());
            System.out.println("song band"+bestSong.getBandName());
            System.out.println("song year"+bestSong.getYearOfRelease());
            
        }
        
        //--hash
        
        Hashtable<Integer, SongInfo> HT90song=songOfThe90s.getBestSong();
        System.out.println("song of 90");
        for(Enumeration<Integer> e=HT90song.keys(); e.hasMoreElements();){
            
            SongInfo bestSong=HT90song.get(e.nextElement());
            System.out.println("song name"+bestSong.getSongName());
            System.out.println("song band"+bestSong.getBandName());
            System.out.println("song year"+bestSong.getYearOfRelease());
            
        }
    }
    public void showTheSong2(){
        Iterator songs70s=iter70sSongs.createIterator();
        Iterator songs80s=iter80sSongs.createIterator();
        Iterator songs90s=iter90sSongs.createIterator();
        
        System.out.println("print the 70s");
        
        printTheSong(songs70s);
        
        System.out.println("print the 80s");
        
        printTheSong(songs80s);
        
        System.out.println("print the 90s");
        
        printTheSong(songs90s);
    }
      public void printTheSong(Iterator iterator){      
          while(iterator.hasNext()){
              
              SongInfo songInfo=(SongInfo) iterator.next();
               System.out.println("song name"+songInfo.getSongName());
            System.out.println("song band"+songInfo.getBandName());
            System.out.println("song year"+songInfo.getYearOfRelease());
            
          }
              
          }
}
