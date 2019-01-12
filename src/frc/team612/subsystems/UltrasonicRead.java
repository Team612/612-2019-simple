package frc.team612.subsystems;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;

public class UltrasonicRead extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DigitalInput ultrasonicSignal=new DigitalInput(RobotMap.ultrasonic);

    public boolean getSignal(){
        return ultrasonicSignal.get();
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

