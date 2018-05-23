/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.observer;

/**
 *
 * @author acer
 */
public class StockObserver implements Observer{
    private double ibmPrice;
    private double applPrice;
    private double googlPrice;
    
    private static int observerIDTracker=0;
    private int observerID;
    private Subject StockGrabber;
    
    public StockObserver( Subject StockGrabber){
        this.StockGrabber=StockGrabber;
        this.observerID=++observerIDTracker;
        System.out.println("observer id "+this.observerID);
        StockGrabber.register(this);
        
    }
    

    @Override
    public void update(double ibmPrice, double applPrice, double googlPrice) {
        this.ibmPrice=ibmPrice;
        this.applPrice=applPrice;
        this.googlPrice=googlPrice;
        printThePrices();
      }
    public void printThePrices(){
        System.out.println(observerID+"\nIbm="+ibmPrice+"\nappl="+applPrice+"\ngoogl="+googlPrice+"\n");
    }
}
