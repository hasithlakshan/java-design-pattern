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
//give the robot features to the robot and return robot
public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;
    
    public OldRobotBuilder(){
        this.robot=new Robot();
    }

    @Override
    public void builRobotHead() {
        robot.setRobotHead("tin head");
    }

    @Override
    public void builRobotTorso() {
        robot.setRobotTorso("tin torso");
    }

    @Override
    public void builRobotArms() {
        robot.setRobotArms("metal line aerms");
    }

    @Override
    public void builRobotLegs() {
        robot.setRobotLegs("roller Skates ");
    }

    @Override
    public Robot getRobot() {
       return this.robot;
    }
    
}
