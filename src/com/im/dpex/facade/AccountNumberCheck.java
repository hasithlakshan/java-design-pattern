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
public class AccountNumberCheck {
    
    private int accountNum=123456789;
    public int getaccountNum(){
        return accountNum;
    }
    
    public boolean accountActive(int accNoToCheck){
        if(accNoToCheck==getaccountNum()){
            return true;
            
        }
        else{
           
            return false;
            
        }
        
    }
    
}
