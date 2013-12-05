/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gosparx.team1126;

/**
 *
 * @author Alex_Fixed
 */
public class Autonomous {
    /**************************************************************************/
    public static final int DRIVES_GO_FORWARD               = 1;//distance(inches), speed (int)
    public static final int DRIVES_GO_REVERSE               = 2;
    public static final int DRIVES_TURN_RIGHT               = 3;
    public static final int DRIVES_TURN_LEFT                = 4;
    public static final int DRIVES_STOP                     = 5;
    public static final int WAIT                            = 99;
    /**************************************************************************/
    
    public void run(){
        int[][] currAuto = {};
        int start = 0;
        int end = currAuto.length;
        for(int curr = start; start < end; curr++){
            switch(currAuto[curr][0]){
                case DRIVES_GO_FORWARD:
                    driveForward(currAuto[curr][1], currAuto[curr][2]);
                case DRIVES_GO_REVERSE:
                    drivesReverse(currAuto[curr][1], currAuto[curr][2]);
                case DRIVES_TURN_LEFT:
                    drivesLeft(currAuto[curr][1]);
                case DRIVES_TURN_RIGHT:
                    drivesRight(currAuto[curr][1]);
                case DRIVES_STOP:
                    stopDrives();
                case WAIT:
                    Thread.sleep(currAuto[curr][1]);
            }
        }
    }
    /**
     * Drives the robot dis inches forward at speed speed
     */
    public void drivesForward(int dis, int speed){
        
    }
     /**
     * Drives the robot dis inches backwards at speed speed
     */
    public void drivesBackwards(int dis, int speed){
        
    }
    /**
     * turns the robot deg degrees to the left
     * */
    public void drivesTurnLeft(int deg){
        
    }
    /**
     * turns the robot deg degrees to the right
     */
    public void drivesTurnRight(int deg){
        
    }
    /**
     * stops the drives
     */
    public void drivesStop(){
        
    }
}
