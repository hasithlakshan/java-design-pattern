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
public class FundsCheck {
    private double cashInAccount=1000.00;
    public double getcashInAccount(){
        return cashInAccount;
    
    }
    
    public void decreaseCashInAccount(double cashToWithdrawn){
        cashInAccount-=cashToWithdrawn;
        
    }
    public void increaseCashInAccount(double cashToDeposit){
        cashInAccount+=cashToDeposit;
    }
    
    public boolean haveToEnoughMoney(double cashToWithdrawal){
        if(getcashInAccount()<cashToWithdrawal){
            System.out.println(" sorry your account balance is"+getcashInAccount());
            return false;
        }else{
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("withdraw successfullly");
            System.out.println("your current account balance is"+getcashInAccount());
            return true;
        }
        
    }
    public boolean depositMoney(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("cash deposit successfully");
        System.out.println("your current balance is"+getcashInAccount());
        return true;

        
    }
    
}
