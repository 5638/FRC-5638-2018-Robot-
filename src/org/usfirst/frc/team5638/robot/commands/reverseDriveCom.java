package org.usfirst.frc.team5638.robot.commands;

import org.usfirst.frc.team5638.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class reverseDriveCom extends Command {

    public reverseDriveCom() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSub.reverseDrive(Robot.m_oi.xbox1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSub.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
