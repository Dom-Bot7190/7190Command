package frc.team7190.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7190.Robot;

public class Flipper_Command extends Command {
    public Flipper_Command() {

        requires(Robot.Flipper);
    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {

        Robot.Flipper.flip();
    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    @Override
    protected void execute() {

    }

    @Override
    protected boolean isFinished() {

        return isTimedOut();
    }


    /**
     * Called once when the command ended peacefully; called once
     * after {@link #isFinished()} returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    @Override
    protected void end() {

        Robot.Flipper.stop();
    }


    @Override
    protected void interrupted() {

        end();
    }
}
