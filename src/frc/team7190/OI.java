/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7190;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team7190.commands.Flipper_Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    //Creates joystick, trigger, and flipper solenoid
    Joystick Driver = new Joystick(0);
    Button Trigger = new JoystickButton(Driver, 0);
    public OI(){

        Trigger.whileHeld(new Flipper_Command());
    }

    public Joystick getDriverJoystick() {

        return Driver;
    }
}