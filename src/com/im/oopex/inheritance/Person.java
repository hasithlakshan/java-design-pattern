/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.oopex.inheritance;

/**
 *
 * @author acer
 */
public class Person {//supper class
    private String name;
    private String address;
    private String nic;
    private String tp;
    public void attend(){
        
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

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the tp
     */
    public String getTp() {
        char c=getNic().charAt(2);
        int ci=Integer.parseInt(c+"");
        if(ci>5){
            return "0715238466";
        }else{
            return tp;
        }
        
    }
    public String getTpLecture(){
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(String tp) {
        this.tp = tp;
    }
    
}
