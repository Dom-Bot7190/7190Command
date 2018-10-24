package frc.team7190.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.team7190.Robot;

//This command drives the robot across the baseline
public class Baseline_Command extends Command {

    private Timer driveTimer = new Timer();

    public Baseline_Command(){

        //Sets drive time to 3 seconds
        requires(Robot.DriveTrain);
    }

    @Override
    protected void initialize() {

        //Actually drives the robot
        Robot.DriveTrain.DriveForwards();
        driveTimer.reset();
        driveTimer.start();
    }

    @Override
    protected void execute() {

        if (driveTimer.get() < 3.0) {
            Robot.DriveTrain.DriveForwards();
        } else {
            Robot.DriveTrain.Stop();
        }
    }

    @Override
    protected boolean isFinished() {

        return false;
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
