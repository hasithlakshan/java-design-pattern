/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.strategy;

/**
 *
 * @author acer
 */
public class Demo {
        public static void main(String[] args) {
            Animal zimba=new Dog();
             System.out.println("dog "+zimba.tryToFly());
             Animal speady=new Bird();
             System.out.println("bird "+speady.tryToFly());
        
    }
    
    
    
}
