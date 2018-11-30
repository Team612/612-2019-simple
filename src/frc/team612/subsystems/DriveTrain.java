package frc.team612.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.team612.RobotMap;

public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static WPI_TalonSRX Talon_FR=new WPI_TalonSRX(RobotMap.Talon_FR);
    public static WPI_TalonSRX Talon_FL=new WPI_TalonSRX(RobotMap.Talon_FL);
    public static WPI_TalonSRX Talon_RR=new WPI_TalonSRX(RobotMap.Talon_RR);
    public static WPI_TalonSRX Talon_RL=new WPI_TalonSRX(RobotMap.Talon_RL);
    public static MecanumDrive mecanumdrive= new MecanumDrive(Talon_FL,Talon_RL,Talon_FR,Talon_RR);
    public static MecanumDrive getMecDrive(){
        return mecanumdrive;
    }
    public static WPI_TalonSRX getTalon(int num) {
        switch(num){
            case 1: return Talon_FR;
            case 2: return Talon_FL;
            case 3: return Talon_RR;
            case 4: return Talon_RL;
            default: return null;
        }
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

