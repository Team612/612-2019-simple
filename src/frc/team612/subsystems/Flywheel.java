package frc.team612.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;

public class Flywheel extends Subsystem {
WPI_TalonSRX talon=new WPI_TalonSRX(RobotMap.talon);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
    public WPI_TalonSRX getTalon() {
        return talon;

    }
}

