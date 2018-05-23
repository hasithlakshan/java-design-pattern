/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oopex.Abstract;

/**
 *
 * @author acer
 */
abstract public class Animal {
    private String name;
    private int weight;
    private String sound;

    
    public abstract String getName();
    public abstract void setName(String newName);
    
    public abstract int getWeight();
    public abstract void setWeight(int newWeight);
     
    public abstract String getSound();
    public abstract void setSound(String newSound);
}
