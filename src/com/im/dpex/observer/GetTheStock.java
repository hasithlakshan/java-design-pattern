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
import java.text.DecimalFormat;
public class GetTheStock implements Runnable{
    private int startTime;
    private String Stock;
    private double price;
    
    private Subject StockGrabber;
    
    public GetTheStock(Subject stockGtabber,int newStartTime,String newStock,double newPrice){
        this.StockGrabber=stockGtabber;
        startTime=newStartTime;
        Stock=newStock;
        price=newPrice;
        
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                
            }
            double randNum=(Math.random()*(.06))-.03; 
            
            DecimalFormat df= new DecimalFormat("#.##");
            price=Double.valueOf(df.format(price+randNum));
            
            
            if(Stock=="IBM") ((StockGrabber)StockGrabber).setIbmPrice(price);
            if(Stock=="APPL") ((StockGrabber)StockGrabber).setIbmPrice(price);
            if(Stock=="GOOGL") ((StockGrabber)StockGrabber).setIbmPrice(price);
            
            System.out.println(Stock+":"+df.format((price+randNum))+" "+df.format(randNum));
            System.out.println(" ");
                
            }
        }
    }
    

