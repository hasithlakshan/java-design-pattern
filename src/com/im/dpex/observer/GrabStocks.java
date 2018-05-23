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
public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber=new StockGrabber();
        
        StockObserver observer1=new StockObserver(stockGrabber);
        
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplPrice(167.00);
        stockGrabber.setGooglPrice(178.00);
        
        StockObserver observer2=new StockObserver(stockGrabber);
        
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplPrice(167.00);
        stockGrabber.setGooglPrice(178.00);
        
        
        Runnable getIBM=new GetTheStock(stockGrabber,2,"IBM",197.00);
        Runnable getAPPL=new GetTheStock(stockGrabber,2,"IBM",197.00);
        Runnable getGOOGL=new GetTheStock(stockGrabber,2,"IBM",197.00);
        
        new Thread(getIBM).start();
        new Thread(getAPPL).start();
        new Thread(getGOOGL).start();
    }
    
}
