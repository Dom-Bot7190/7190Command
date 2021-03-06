7190Command

*experimental*

## What files should I worry about?

All of the files we are concerned with are in /src/.

build/, dist/, and out/ are folders (and files) generated by Java, the programming language this is written in. Don't change any files in these folders.

The source folder looks like this:

**src/**\
&ensp;&ensp;**frc**/\
&ensp;&ensp;&ensp;&ensp;**team7190**/\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;*The commands are stored here. This could be [activating the flipper](\src\frc\team7190\commands\Flipper_Command.java), or [Driving forward during autonomous mode](\src\frc\team7190\commands\Flipper_Command.java).*\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;**commands/**\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;- ArcadeDrive_Command.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;- Baseline_Command.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;- Flipper_Command.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;**subsystems/**\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;- DriveTraain_Subsystem.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;- Flipper_Subsystem.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;OI.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Robot.java\
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;RobotMap.java

## So why are there so many files?

Having everything in seperate files makes it easier to understand the flow of the code. It's also much easier to find a specific section of code if you know where to look.



### The code starts with OI.java

OI stands for **O**bject **I**nterface. Pretty self explanitory, it functions as the interface between the physical objects and controls and the code. 

When we plug the joystick in, this is the file it talks to as you can see in these lines here:
```java
// OI.java
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
```
These lines of code are **importing** other pieces of code. Someone else wrote the code to know what buttons are being pressed, and we are borrowing it. 

```java
// OI.java
Joystick Driver = new Joystick(0);
```

This line is creating a new Joystick object. An object in programming can be thought of as an object in real life. A Joystick in real life has characteristics, like colour, size and weight. And things you can do with it like push buttons or move the joystick. 

Our virtual Joystick has characteristics too, like which buttons are pressed, etc., and things you can do with it too. If this is confusing, don't worry, it's a difficult concept to wrap your head around.

```java
// OI.java
Trigger.whileHeld(new Flipper_Command());
```

When the trigger is held (```Trigger.whileHeld()```), activate the flipper (```new Flipper_Command()```).

The flipper command lives in ```commands/Flipper_Command.java```).

In that file, we can see deeper into how the code works. 

```java
// Flipper_Command.java
    
    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {

        Robot.Flipper.flip();
    }

```

As the comment says, whenever you create this object (with the ```new``` keyword), this function runs.
The code is very on the nose:

```java
// Flipper_Comand.java
Robot.Flipper.flip();
```

The code for the flip command can be found in subsystems/Flipper_Subsystem:

```java
// Flipper_Subsystem.java
public void flip() {

    FlipperSol.set(true);
    }

public void stop() {

    FlipperSol.set(false);
}
```

```Sol``` stands for solenoid, the thing that activates the pneumatics.

## Conclusion

In conclusion:

```OI.java``` is the glue between physical driver controls and digital.

```Robot.java``` is the control center of the robot. It decides what should be run and where.

```Commands``` are the interface between ```OI.java and Robot.java``` and the subsystems.

```Subsystems``` directly interact with the physical things on the robot, eg. a Solenoid or Motor.

```RobotMap``` is a map for the code so that it can find where to send the electricity to move a Motor for example.
