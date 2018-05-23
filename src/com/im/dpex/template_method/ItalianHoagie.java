/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.template_method;

/**
 *
 * @author acer
 */
public class ItalianHoagie extends Hoagie{
    
    public ItalianHoagie(){
          System.out.println("lets make italian hoagie");
    }
    
    String [] meatused={"chicken","fish","beaf"};
    String [] vegused={"carrot","tomato","onions","sweet paper"};
    String [] cheeseused={"provolone"};
    String [] condimentsused={"oil","vinegar "};

    @Override
    void addMeat() {
        System.out.print("adding the meat:-");
        for(String meat:meatused){
            System.out.print(meat+" ");
            
        }
          System.out.println("");
    }

    @Override
    void addCheese() {
         System.out.print("adding the cheese:-");
        for(String cheese:cheeseused){
            System.out.print(cheese+" ");
            
        }
          System.out.println("");
    }

    @Override
    void addVegitable() {
         System.out.print("adding the vegitable:-");
        for(String vegitable:vegused){
            System.out.print(vegitable+" ");
            
        }
          System.out.println("");
    }

    @Override
    void addcondiments() {
         System.out.print("adding the condiments:-");
        for(String condiments:condimentsused){
            System.out.print(condiments+" ");
            
        }
        System.out.println("");
    }
    
    
}
