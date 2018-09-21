package frc.team7190.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7190.Robot;

public class ArcadeDrive_Command extends Command {

    public ArcadeDrive_Command(){
        requires(Robot.DriveTrain);
    }

    @Override
    protected void initialize(){

    }

    @Override
    protected void execute(){
        Robot.DriveTrain.TeleopDrive(Robot.oi.getDriverJoystick());
    }

    @Override
    protected boolean isFinished(){
        return false;
    }

    @Override
    protected void end(){

    }

    @Override
    protected void interrupted(){

    }
}
