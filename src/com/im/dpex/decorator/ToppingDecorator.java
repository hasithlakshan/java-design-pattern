/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.decorator;

/**
 *
 * @author acer
 */
abstract class ToppingDecorator implements Pizza{
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newpizza){
        this.tempPizza=newpizza;
    }
    public String getDiscription(){
        return tempPizza.getDiscription();
    }
    
    public double getCost(){
        return tempPizza.getcost();
    }
}
