/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.observer;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class StockGrabber implements Subject{
    
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googlPrice;
    
    public StockGrabber(){
        observers=new ArrayList<Observer>();
    }
    
    
    
    @Override
    public void register(Observer o) {
        observers.add(o);
        }

    @Override
    public void unregister(Observer o) {
        int indexOfOBserver=observers.indexOf(o);
        System.out.println("observer"+indexOfOBserver+1+"deleted");
        observers.remove(indexOfOBserver);
        
       }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(ibmPrice, applPrice, googlPrice);
            
        }
        }

    
    public void setIbmPrice(double newIdmPrice) {
        this.ibmPrice = newIdmPrice;
        notifyObserver();
    }

    
    public void setApplPrice(double newApplPrice) {
        this.applPrice = newApplPrice;
        notifyObserver();
    }

    
    public void setGooglPrice(double newGooglPrice) {
        this.googlPrice = newGooglPrice;
        notifyObserver();
    }
    
}
