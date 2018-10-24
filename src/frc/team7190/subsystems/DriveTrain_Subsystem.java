package frc.team7190.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team7190.RobotMap;
import frc.team7190.commands.ArcadeDrive_Command;

public class DriveTrain_Subsystem extends Subsystem {

    //Creates MainDrive for operating wheels
    private RobotDrive MainDrive = new RobotDrive(RobotMap.Drive_Left, RobotMap.Drive_Right);

    @Override
    protected void initDefaultCommand() {

        //Teleop command
        setDefaultCommand(new ArcadeDrive_Command());
    }

    public void TeleopDrive(Joystick Driver){

        //Sets motor values to joystick values
        MainDrive.arcadeDrive(Driver);
    }

    //Movement options
    public void DriveForwards(){ MainDrive.drive(0.7, 0);}

    //These will be used in future autos
    public void TurnLeft(){ MainDrive.drive(0, 0.5);}

    public void TurnRight(){ MainDrive.drive(0, -0.5);}

    public void Stop(){ MainDrive.drive(0, 0); }
}
