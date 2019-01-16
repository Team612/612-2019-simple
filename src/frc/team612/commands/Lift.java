package frc.team612.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team612.Robot;
import frc.team612.subsystems.RobotLift;


public class Lift extends Command {
    public Lift() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.robotLift);
    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {

    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    @Override
    protected void execute() {
        if(Robot.oi.driver_backLift_up.get()){//Tests to see whether button is pressed
            //Sets back pair of talons to go forward
            RobotLift.getTalon(3).set(1);
            RobotLift.getTalon(4).set(1);
        }else if(Robot.oi.driver_backLift_down.get()){//Tests to see whether other button is pressed, adds protection to prevent up and down commands to be sent at the same time
            //Set back pair of talons to go backwards
            RobotLift.getTalon(3).set(-1);
            RobotLift.getTalon(4).set(-1);
        }else{//If no button is pressed, set talons to stop
            RobotLift.getTalon(3).set(0);
            RobotLift.getTalon(4).set(0);
        }
        //Same thing as previous if statement, except applied to front talon set
        if(Robot.oi.driver_frontLift_up.get()){
            RobotLift.getTalon(1).set(1);
            RobotLift.getTalon(2).set(1);
        }else if(Robot.oi.driver_frontLift_down.get()){
            RobotLift.getTalon(1).set(-1);
            RobotLift.getTalon(2).set(-1);
        }else{
            RobotLift.getTalon(1).set(0);
            RobotLift.getTalon(2).set(0);
        }
    }


    /**
     * <p>
     * Returns whether this command is finished. If it is, then the command will be removed and
     * {@link #end()} will be called.
     * </p><p>
     * It may be useful for a team to reference the {@link #isTimedOut()}
     * method for time-sensitive commands.
     * </p><p>
     * Returning false will result in the command never ending automatically. It may still be
     * cancelled manually or interrupted by another command. Returning true will result in the
     * command executing once and finishing immediately. It is recommended to use
     * {@link edu.wpi.first.wpilibj.command.InstantCommand} (added in 2017) for this.
     * </p>
     *
     * @return whether this command is finished.
     * @see Command#isTimedOut() isTimedOut()
     */
    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }


    /**
     * Called once when the command ended peacefully; that is it is called once
     * after {@link #isFinished()} returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    @Override
    protected void end() {

    }


    /**
     * <p>
     * Called when the command ends because somebody called {@link #cancel()} or
     * another command shared the same requirements as this one, and booted it out. For example,
     * it is called when another command which requires one or more of the same
     * subsystems is scheduled to run.
     * </p><p>
     * This is where you may want to wrap up loose ends, like shutting off a motor that was being
     * used in the command.
     * </p><p>
     * Generally, it is useful to simply call the {@link #end()} method within this
     * method, as done here.
     * </p>
     */
    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
