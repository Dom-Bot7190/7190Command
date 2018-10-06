package frc.team7190.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7190.Robot;
import edu.wpi.first.wpilibj.Timer;

public class Baseline_Command extends Command {

    public Baseline_Command(){ requires(Robot.DriveTrain);}

    private Timer m_timer = new Timer();

    @Override
    protected void initialize() {
        m_timer.reset();
        m_timer.start();
    }

    @Override
    protected void execute() {
        if (m_timer.get() < 3.0) {
            //Why don't this bit work? halp
            MainDrive.drive(0.7, 0.0); // drive forwards
        } else {
            MainDrive.stopMotor(); // stop robot
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end()
    {

    }

    @Override
    protected void interrupted()
    {
        super.interrupted();
    }
}
