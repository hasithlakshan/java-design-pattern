/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.reflection;

/**
 *
 * @author acer
 */
public class UFOEnemyShip extends EnemyShip{
    private String idCode="100";
    
    private String getPrivate(){
        return "how did you get this";
    }
    
    private String getOtherPrivate(int thisint,String thatString){
        return "how did you get"+thisint+" "+thatString;
       
}
    public UFOEnemyShip(int number,String randString){
        System.out.println("you send "+number+" "+randString);
        
    }
    
    EnermyShipFactor shipFactor;
    
    
    public UFOEnemyShip(EnermyShipFactor shipfactor){
        this.shipFactor=shipfactor;
    }
    
    
}
