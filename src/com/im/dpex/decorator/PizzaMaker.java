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
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza=new TomatoSouce(new Mozzarella(new PlanPizza() ));
        System.out.println("get ingradians :"+basicPizza.getDiscription());
        System.out.println("get price "+basicPizza.getcost());
        
        
        
    }
    
}
