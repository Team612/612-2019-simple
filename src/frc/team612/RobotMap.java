/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team612;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
    public static int Talon_FR=7;
    public static int Talon_FL=1;
    public static int Talon_RR=3;
    public static int Talon_RL=4;
    public static int driver=0;
    public static int gunner=1;
    public static int belt_1 = 5;
    public static int belt_2 = 6;
    public static int flywheel = 7;
    public static int frontLeftLineTracker = 0;
    public static int frontRightLineTracker = 1;
    public static int backCenterLineTracker = 2;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}