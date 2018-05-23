/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class Sheep implements Animal{
    public Sheep(){
        System.out.println("sheep is made");
    }

    @Override
    public Animal makecopy() {
        System.out.println("sheep is being made");
        
        Sheep sheepObject=null;
        try {
            sheepObject=(Sheep) super.clone();//supper type animal cast 
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return sheepObject;
    }
    public String toString(){
        return "dolly is sheep";
    }
}
