/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.singleton;

/**
 *
 * @author acer
 */
public class Husband {
    private String name;
    
    
    private static Husband husband;
    
    private Husband(){
        
    }
    public static Husband getInstance(){
        if(husband==null){//if the wife is null create the wife and if wife is implemented return the wife object
            husband=new Husband();
        }
        return husband;
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
