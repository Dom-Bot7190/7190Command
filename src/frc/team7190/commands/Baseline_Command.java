package frc.team7190.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7190.Robot;

public class Baseline_Command extends Command {

    public Baseline_Command(){
        super("Baseline_Command");
        requires(Robot.DriveTrain);
        setTimeout(3.0);
    }

    @Override
    protected void initialize() {
        Robot.DriveTrain.DriveForwards();
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end()
    {
        Robot.DriveTrain.Stop();
    }

    @Override
    protected void interrupted()
    {
        end();
    }
}
