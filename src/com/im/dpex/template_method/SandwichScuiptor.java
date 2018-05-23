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
public class SandwichScuiptor {
    public static void main(String[] args) {
        Hoagie cust1=new ItalianHoagie();
        cust1.makeSandwich();
        
        Hoagie cust2=new VegiHoagie();
        cust2.makeSandwich();
        
    }
    
}
