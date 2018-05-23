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
public class Animal {
    private String name;
    private double weight;
    private String sound;
    
    public Flys flyingType;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>0){
        this.weight = weight;
    }else{
            System.out.println("weight must  be greter than 0");
        }
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public String tryToFly(){
        return flyingType.fly();
    }
    
}
