/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.prototype;

/**
 *
 * @author acer
 */
public class TestCloning {
    public static void main(String[] args) {
        
        CloneFactor animalmaker=new CloneFactor();
        
        Sheep sally=new Sheep();
        
        Sheep cloneSheep=(Sheep)animalmaker.getClone(sally);//pass the clone factor to create a sheep clone
        
        System.out.println(sally);
        System.out.println(cloneSheep);
        System.out.println("sally hashcode :"+System.identityHashCode(sally));
        System.out.println("clone hashcode :"+System.identityHashCode(cloneSheep));
        
    }
    
}
