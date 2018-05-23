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
public class Dog extends Animal {
    private String name;
    private int weight;
    private String Sound;

    @Override
    public String getName() {
        return name;
        }

    @Override
    public void setName(String newName) {
        name=newName;
    }

    @Override
    public int getWeight() {
        return weight;
        }

    @Override
    public void setWeight(int newWeight) {
        weight=newWeight;
        }

    @Override
    public String getSound() {
        return Sound;
    }

    @Override
    public void setSound(String newSound) {
        Sound=newSound;
       }

    
    
}
