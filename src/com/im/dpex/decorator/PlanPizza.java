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
public class PlanPizza implements Pizza{

    @Override
    public String getDiscription() {
        return " thin dough ";  
    }

    @Override
    public double getcost() {
        return 4.00;
    }
    
}
