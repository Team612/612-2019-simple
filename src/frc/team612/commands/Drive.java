package frc.team612.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.team612.Robot;


public class Drive extends Command {
    private double x = 0;
    private double y = 0;
    private double r = 0;
    private double m = 0;
    private double a = 0;
    public void getInput(){
        x = Robot.oi.driver.getX(GenericHID.Hand.kLeft);
        y = Robot.oi.driver.getY(GenericHID.Hand.kLeft);
        r = Robot.oi.driver.getX(GenericHID.Hand.kRight);
    }
    public void calc(){
       m = Math.abs(x*x + y*y);
       a = Math.atan2(y,x);
       a = a*(Math.PI/180);
    }
    public Drive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.driveTrain);
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
        System.out.println(Robot.oi.driver.getY(GenericHID.Hand.kLeft));
        if (Robot.oi.isTankDrive) {
            Robot.driveTrain.getTalon(2).set(Robot.oi.driver.getY(GenericHID.Hand.kLeft));
            Robot.driveTrain.getTalon(1).set(Robot.oi.driver.getY(GenericHID.Hand.kRight));
          //  Robot.driveTrain.getTalon(3).set(Robot.oi.driver.getY(GenericHID.Hand.kLeft));
          //  Robot.driveTrain.getTalon(4).set(Robot.oi.driver.getY(GenericHID.Hand.kRight));
        } else {
            getInput();
            calc();
            //Robot.driveTrain.getMecDrive().drivePolar(m, a, r);
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