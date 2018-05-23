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
public class Demo1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("chamara");//inherited variable
        s1.setCourseFree(45000);
        s1.register(45000);
        s1.payment();
        s1.attend();//inherited method
        s1.fight();
        
        Lecturer l1=new Lecturer();
        l1.setName("nadun");//inherited variable
        l1.setHourlyRate(1000);
        l1.attend();//inherited method
        l1.paySalary();
        
    }
    
    
}
