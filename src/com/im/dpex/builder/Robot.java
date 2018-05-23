/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.builder;

/**
 *
 * @author acer
 */
//items of the robot
public class Robot implements RobotPlan{
    
    private String robotHead;
    private String robottorso;
    private String robotarms;
    private String robotlegs;

    @Override
    public void setRobotHead(String head) {
        robotHead=head;
    }

    @Override
    public void setRobotTorso(String torso) {
        robottorso=torso;
    }

    @Override
    public void setRobotArms(String arms) {
        robotarms=arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        robotlegs=legs;
    }
    
    
    
    
    public String getRobotHead() {
        return robotHead;
    }

    public String getRobottorso() {
        return robottorso;
    }
    public String getRobotarms() {
        return robotarms;
    }
    public String getRobotlegs() {
        return robotlegs;
    }
    
}
