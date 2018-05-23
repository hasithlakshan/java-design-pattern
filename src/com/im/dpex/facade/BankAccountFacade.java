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
public class BankAccountFacade {
    private int accountNo;
    private int sequrityCode;
    public int getAccountNo(){
        return accountNo;
    }
    public int getSecurityCode() {
        return sequrityCode;
    }
    
    
    AccountNumberCheck accNoCheck;
    SecurityCodeCheck sequrityCodeCheck;
    FundsCheck foundCheck;
    
    public BankAccountFacade(int accNo,int seqCode){
        accountNo=accNo;
        sequrityCode=seqCode;
        
        accNoCheck=new AccountNumberCheck();
        sequrityCodeCheck=new SecurityCodeCheck();
        foundCheck=new FundsCheck();
      
                
    }
    public void withdrawcash(double cashToGet){
        if(accNoCheck.accountActive(getAccountNo())&&sequrityCodeCheck.isCorrectCode(getSecurityCode())&&foundCheck.haveToEnoughMoney(cashToGet)){
                  System.out.println("transacction complete");            
        }else{
            System.out.println("transaction fail");
        }
        
    }
    public void depositCash( double depositCash){
        if(accNoCheck.accountActive(getAccountNo())&&sequrityCodeCheck.isCorrectCode(getSecurityCode())){
            foundCheck.depositMoney(depositCash);
            System.out.println("transaction complete");
            
        }else{
            System.out.println("transacction fail");
        }
    }
    
    
}
