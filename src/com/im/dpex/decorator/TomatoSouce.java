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
//adding souce
public class TomatoSouce extends ToppingDecorator{

    public TomatoSouce(Pizza newpizza) {
        super(newpizza);
        System.out.println("adding souce");
    }

    /**
     *
     * @return
     */
    public String getDiscription() {
            return tempPizza.getDiscription()+" Tomato souce ";
    }
    @Override
    public double getcost() {
        return tempPizza.getcost()+.34;
    }
}
