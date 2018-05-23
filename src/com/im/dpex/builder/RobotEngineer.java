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
//genarate robot
public class RobotEngineer {
    private RobotBuilder robotBuilder;
    
    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder=robotBuilder;
    }
    
    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }
    
    public void makeRobot(){
        this.robotBuilder.builRobotHead();
        this.robotBuilder.builRobotTorso();
        this.robotBuilder.builRobotArms();
        this.robotBuilder.builRobotLegs();
    }
    
}
