/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.strategy;

/**
 *
 * @author acer
 */
public class Bird extends Animal{
    public void speed(){
        System.out.println("200kmh");
    }
    public Bird(){
        super();
        setSound("kiw kiw");
        
        flyingType=new Itfly();//set the flying type
        
        
    }
    
}
