/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.command;

/**
 *
 * @author acer
 */
public class TvRemote {
    public static ElectronicDevice geDevice(){
        return new Telivision();
    }
    
}
