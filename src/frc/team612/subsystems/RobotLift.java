package frc.team612.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;

public class RobotLift extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static WPI_TalonSRX Talon_Lift_FR = new WPI_TalonSRX(RobotMap.Talon_Lift_FR);
    public static WPI_TalonSRX Talon_Lift_FL = new WPI_TalonSRX(RobotMap.Talon_Lift_FL);
    public static WPI_TalonSRX Talon_Lift_RR = new WPI_TalonSRX(RobotMap.Talon_Lift_RR);
    public static WPI_TalonSRX Talon_Lift_RL = new WPI_TalonSRX(RobotMap.Talon_Lift_RL);

    //accesses one of the four talons.
    public static WPI_TalonSRX getTalon(int n){
        switch (n){
            case 1: return Talon_Lift_FR;
            case 2: return Talon_Lift_FL;
            case 3: return Talon_Lift_RR;
            case 4: return Talon_Lift_RL;
            default: return null;
        }
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

