package frc.team612.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.Robot;
import frc.team612.RobotMap;

public class Push extends Subsystem {
    public DoubleSolenoid topSolenoid = new DoubleSolenoid(RobotMap.SolenoidClose, RobotMap.SolenoidOpen);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

    public DoubleSolenoid getTopSolenoid() {
        return topSolenoid;
    }
}

