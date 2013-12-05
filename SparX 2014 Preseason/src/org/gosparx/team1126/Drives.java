package org.gosparx.team1126;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
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
    private Encoder leftEncoder;
    private Encoder rightEncoder;
    private double leftMotorValue = 0.0;
    private double rightMotorValue = 0.0;
    
    public Drives(){
        leftDrive1 = new Victor(IO.PWMLeftDrives1);
        leftDrive2 = new Victor(IO.PWMLeftDrives2);
        rightDrive1 = new Victor(IO.PWMRightDrives1);
        rightDrive1 = new Victor(IO.PWMRightDrives2);
        leftEncoder = new Encoder(IO.leftEncoderChan1, IO.leftEncoderChan2, true, CounterBase.EncodingType.k4X);
        rightEncoder = new Encoder(IO.rightEncoderChan1, IO.rightEncoderChan2, true, CounterBase.EncodingType.k4X);
    }
    
    /**
     * Set the left and right motor values
     * @param leftMotor -1 - 1(forward is 1)
     * @param rightMotor -1 - 1(forward is 1)
     */
    public void setMotorValues(double leftMotor, double rightMotor){
        leftMotorValue = leftMotor;
        rightMotorValue = rightMotor;
        leftDrive1.set(leftMotor);
        leftDrive2.set(leftMotor);
        rightDrive1.set(rightMotor);
        rightDrive2.set(rightMotor);
    }
    
    /**
     * @return left motor value (-1 - 1)
     */
    public double getLeftMotorValue(){
        return leftMotorValue;
    }
    
    /**
     * @return right motor value (-1 - 1)
     */
    public double getRightMotorValue(){
        return rightMotorValue;
    }
    
    /**
     * 
     * @return the distance the left drive wheels have traveled
     */
    public double getLeftEncoderDistance(){
        return leftEncoder.getDistance();
    }
    
    /**
     * 
     * @return the distance the right drive wheels have traveled
     */
    public double getRightEncoderDistance(){
        return rightEncoder.getDistance();
    }
}
