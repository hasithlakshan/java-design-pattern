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
public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza newpizza) {
        super(newpizza);
        System.out.println("adding dough");
        System.out.println("adding moz");
    }

    /**
     *
     * @return
     */
    public String getDiscription() {
            return tempPizza.getDiscription()+" mozzarella ";
    }
    @Override
    public double getcost() {
        return tempPizza.getcost()+.50;
    }
}
