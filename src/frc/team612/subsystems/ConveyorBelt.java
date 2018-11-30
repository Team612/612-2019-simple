package frc.team612.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;

public class ConveyorBelt extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static WPI_TalonSRX Belt_1=new WPI_TalonSRX(RobotMap.belt_1);
    public static WPI_TalonSRX Belt_2=new WPI_TalonSRX(RobotMap.belt_2);
    public WPI_TalonSRX getTalon(int num){
        if (num == 1) {
            return Belt_1;
        }
        else{
            return Belt_2;
        }
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

