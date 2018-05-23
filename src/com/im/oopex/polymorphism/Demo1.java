/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oopex.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class Demo1 {
    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();
        Animal a3=new Cow();
        Animal a4=new Animal() {//class alian entend animal //annonimus inner class
            @Override   //annonimus inner class
            public void sound() {//annonimus inner class
                System.out.println("creeek");  //annonimus inner class 
            }//annonimus inner class
        };//annonimus inner class
        
        List<Animal> list=new ArrayList<>();
          list.add(a1);
          list.add(a2);
          list.add(a3);
          list.add(a4);
          for(Animal animal:list){
              animal.sound();
              
          }
    }
    
}
