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
    private static final int DRIVES_GO_FORWARD               = 1;//distance(inches), speed (int)
    private static final int DRIVES_GO_REVERSE               = 2;
    private static final int DRIVES_TURN_RIGHT               = 3;
    private static final int DRIVES_TURN_LEFT                = 4;
    private static final int DRIVES_STOP                     = 5;
    private static final int DRIVES_ARC_LEFT                 = 6;
    private static final int DRIVES_ARC_RIGHT                = 7;
    private static final int WAIT                            = 99;
    /**************************************************************************/
    
    public void run(){
        int[][] currAuto = {};
        int start = 0;
        int end = currAuto.length;
        for(int curr = start; start < end; curr++){
            switch(currAuto[curr][0]){
                case DRIVES_GO_FORWARD:
                    drivesForward(currAuto[curr][1], currAuto[curr][2]);
                case DRIVES_GO_REVERSE:
                    drivesReverse(currAuto[curr][1], currAuto[curr][2]);
                case DRIVES_TURN_LEFT:
                    drivesTurnLeft(currAuto[curr][1]);
                case DRIVES_TURN_RIGHT:
                    drivesTurnRight(currAuto[curr][1]);
                case DRIVES_STOP:
                    drivesStop();
                case WAIT:
            try {
                Thread.sleep(currAuto[curr][1]);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
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
    public void drivesReverse(int dis, int speed){
        
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
    /**
     * uses an arc turn to turn left on an arc with a radius of rad for deg degrees
     */
    public void drivesArcTurnLeft(int rad, int deg){
        
    }
    /**
     * uses an arc turn to turn right on an arc with a  radius of rad for deg degrees
     */
    public void drivesArcTurnRight(int rad, int deg){
        
    }
}
