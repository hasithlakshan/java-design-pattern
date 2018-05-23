/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.facade;

/**
 *
 * @author acer
 */
public class SecurityCodeCheck {
    private int securityCode=12345;
    public int getSecurityCode(){
        return securityCode;
    }
    
    public boolean isCorrectCode(int codeToCheck){
        if(codeToCheck==getSecurityCode()){
            return true;
            
        }
        else{
            return false;
        }
    }
    
}
