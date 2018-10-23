package frc.team7190.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7190.Robot;

//This command drives the robot across the baseline
public class Baseline_Command extends Command {

    public Baseline_Command(){

        //Sets drive time to 3 seconds
        requires(Robot.DriveTrain);
        setTimeout(3.0);
    }

    @Override
    protected void initialize() {

        //Actually drives the robot
        Robot.DriveTrain.DriveForwards();
    }

    @Override
    protected void execute() {

    }

    @Override
    protected boolean isFinished() {

        //What is this?
        return isTimedOut();
    }

    @Override
    protected void end() {

        //Stops all motors
        Robot.DriveTrain.Stop();
    }

    @Override
    protected void interrupted() {

        //If it is forced to finish early, execute end
        end();
    }
}
