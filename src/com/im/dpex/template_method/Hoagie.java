/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.template_method;

/**
 *
 * @author acer
 */
abstract class Hoagie {
    
    final void makeSandwich(){
        
        cutBun();
        
        if(customerWantMeet()){
            addMeat();
           }
        
        if(customerWantCheese()){
            addCheese();
           }
        
        if(customerWantVegitable()){
            addVegitable();
           }
        
        if(customerWantCondiments()){
            addcondiments();
           }
        
        
        wrapTheHoagie();
        
    }
    
    
    
    public void cutBun(){
        System.out.println("the hoagie is cut");
        
        
    }
    
    public void wrapTheHoagie(){
        System.out.println("wrap the hoagie");
          System.out.println("");
        
    }
    
    
    
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegitable();
    abstract void addcondiments();
    
    
    boolean customerWantMeet(){return true;}
    boolean customerWantCheese(){return true;}
    boolean customerWantVegitable(){return true;}
    boolean customerWantCondiments(){return true;}
    
}
