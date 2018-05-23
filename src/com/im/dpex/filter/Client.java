/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.filter;

/**
 *
 * @author acer
 */
public class Client {
    FilterManager filtermanager;
    public void setFilterManager(FilterManager filtermanager){
        this.filtermanager=filtermanager;
    }
    public void sendRequest(String request){
        filtermanager.execute(request);
    }
        
    
}
