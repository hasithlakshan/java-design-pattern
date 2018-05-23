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
//seperate build item type of the robot
public interface RobotBuilder {
    public void builRobotHead();
    public void builRobotTorso();
    public void builRobotArms();
    public void builRobotLegs();
    public Robot getRobot();
}
