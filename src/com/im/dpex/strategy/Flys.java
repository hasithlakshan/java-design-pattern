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
//create an interface because otherwise all the instans we have to create fly method
public interface Flys {
    String fly();
    
}

class Itfly implements Flys{

    @Override
    public String fly() {
        return "can fly";
       }
    
}
class cantfly implements Flys{

    @Override
    public String fly() {
        return "cant fly";
        
        }
    
}
