package frc.team7190.subsystems;


import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team7190.RobotMap;
import frc.team7190.commands.Flipper_Command;

public class Flipper_Subsystem extends Subsystem {

    private Solenoid FlipperSol = new Solenoid(RobotMap.Flipper);

    public void initDefaultCommand() {

        setDefaultCommand(new Flipper_Command());
    }

    public void flip() {

        FlipperSol.set(true);
    }

    public void stop() {

        FlipperSol.set(false);
    }
}

