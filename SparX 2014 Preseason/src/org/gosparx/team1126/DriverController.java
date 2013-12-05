/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gosparx.team1126;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author MaarijPC
 */
public class DriverController {
    private Joystick leftJoy;
    private Joystick rightJoy;
    public DriverController(){
        leftJoy = new Joystick(IO.LEFT_Y_AXIS);
        rightJoy = new Joystick(IO.LEFT_X_AXIS);
    }
}
