/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oopex.oop;

/**
 *
 * @author acer
 */
public class Demo1 {
    public static void main(String[] args) {
        Student s1=new Student("hasith","950422025v","0715238466");
       // s1.name="hasith";//this is variable initialisation
       // s1.nic="950422025v";
        s1.address="pelawatta,pelena,weligama";
       // s1.tp="0711939567";
        
        
        s1.register();//this is method calling
         
         
        Student s2=new Student("kamal","950422024v","0715238422");
//        s2.name="kamal";
//        s2.nic="950422024v";
        s2.address="no 23,galle road,matara";
//        s2.tp="0711939568";
    }
    
}
