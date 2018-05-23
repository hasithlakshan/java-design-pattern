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
public class Demo {
    public static void main(String[] args) {
       
        RobotBuilder oldStyleRobot=new OldRobotBuilder(); //constractor create other object of robot
        
        RobotEngineer robotEngineer=new RobotEngineer(oldStyleRobot);
        
        robotEngineer.makeRobot(); //create a robot 
        
        Robot firstrobot=robotEngineer.getRobot();
        
        System.out.println("first robot builder featurs");
        System.out.println("robot head type:"+firstrobot.getRobotHead());
        System.out.println("robot torso type:"+firstrobot.getRobottorso());
        System.out.println("robot arms type:"+firstrobot.getRobotarms());
        System.out.println("robot legs type:"+firstrobot.getRobotlegs());
    }
    
}
