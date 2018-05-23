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
public class Dog extends Animal{
    public void colour(){
        System.out.println("black");
    }
    public Dog(){
        super();
        setSound("bark");
        
        flyingType=new cantfly();//set the flying type
        
        
    }
    
}
