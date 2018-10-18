package frc.team7190.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team7190.RobotMap;
import frc.team7190.commands.ArcadeDrive_Command;

public class DriveTrain_Subsystem extends Subsystem {
    private RobotDrive MainDrive = new RobotDrive(RobotMap.Drive_Left, RobotMap.Drive_Right);

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive_Command());
    }

    public void TeleopDrive(Joystick Driver){
        MainDrive.arcadeDrive(Driver);
    }

    public void DriveForwards(){ MainDrive.drive(0.7, 0);}

    public void TurnLeft(){ MainDrive.drive(0, 0.5);}

    public void TurnRight(){ MainDrive.drive(0, -0.5);}

    public void Stop(){ MainDrive.drive(0, 0); }
}
