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
public class Student {//this is a class/blue print
    String name;//this are variable
    String nic;//this are variable
    String address;//this are variable
    String tp;//this are variable
    
    
    public Student(){
        super();//calls to object supper class constractor(object class)
       // this("a","b","c"); =recuresive constractor innocation(loop wenawa pass wewi dekatama)
        System.out.println("Student creater........");
    }
    public Student(String name,String nic,String tp){
        this();
        this.name=name;
        this.nic=nic;
        this.tp=tp;
        System.out.println("Student(String name,String nic,String tp) created");
        
    }
    
    public void register(){//these are method
        
    }
    public void attend(){//these are method
        
    }
    public void payment(){//these are method
        
    }
    public void batchTranswere(){//these are method
        
    }
    
    
}
