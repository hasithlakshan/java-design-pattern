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
public class VegiHoagie extends Hoagie{
    
    public VegiHoagie(){
          System.out.println("lets make vehitable hoagie");
        
    }
    // String [] meatused={"chicken","fish","beaf"};
    String [] vegused={"carrot","tomato","onions","sweet paper"};
    String [] condimentsused={"oil","vinegar "};
    
    //customer want to vegi therefor not adding this also if the implement add cheese or addmeat doesn;t matter it not adding
     boolean customerWantMeet(){return false;}
    boolean customerWantCheese(){return false;}
   

    @Override
    void addMeat() {
//        System.out.print("adding the meat:-");
//        for(String meat:meatused){
//            System.out.print(meat+" ");
//            
//        }
//          System.out.println("");
//    
    }

    @Override
    void addCheese() {}

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
