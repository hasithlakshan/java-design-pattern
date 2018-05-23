/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oopex.inheritance;

/**
 *
 * @author acer
 */
public class Student extends Person implements Fightable{//this is a subclass
    private double courseFree;
    
    
    public void register(){//method overloading
        
    }
     public void register(double courseFree){//method overloading
         this.courseFree=courseFree;
        
    }
    
    public void payment(){
        
    }

    /**
     * @return the courseFree
     */
    public double getCourseFree() {
        return courseFree;
    }

    /**
     * @param courseFree the courseFree to set
     */
    public void setCourseFree(double courseFree) {
        this.courseFree = courseFree;
    }

    @Override
    public void fight() {
        System.out.println("Student fight.....");
        }
    
}
