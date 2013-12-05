package org.gosparx.team1126;

import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author Connor
 */
public class Drives {
    
    private Victor leftDrive1;
    private Victor leftDrive2;
    private Victor rightDrive1;
    private Victor rightDrive2;
    
    public Drives(){
        leftDrive1 = new Victor(IO.PWMLeftDrives1);
        leftDrive2 = new Victor(IO.PWMLeftDrives2);
        rightDrive1 = new Victor(IO.PWMRightDrives1);
        rightDrive1 = new Victor(IO.PWMRightDrives2);
    }
    
    public void setMotorValues(double leftMotor, double rightMotor){
        
    }
    
    public double getLeftMotorValue(){
        return 0.0;
    }
    
    public double getRightMotorValue(){
        return 0.0;
    }
    
    public double getLeftMotorEncoder(){
        return 0.0;
    }
    
    public double getRightMotorEncoder(){
        return 0.0;
    }
}
