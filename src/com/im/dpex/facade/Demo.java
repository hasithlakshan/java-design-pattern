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
public class Demo {
    public static void main(String[] args) {
        BankAccountFacade accesstoaccount=new BankAccountFacade(123456789,12345);
        accesstoaccount.depositCash(100);
        accesstoaccount.withdrawcash(900);
        accesstoaccount.withdrawcash(900);
        
    }
    
}
