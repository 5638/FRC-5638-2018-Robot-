package org.usfirst.frc.team5638.robot.commands;

import org.usfirst.frc.team5638.robot.Robot;
import org.usfirst.frc.team5638.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class elevatorUpCom extends Command {

    public elevatorUpCom() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.elevatorSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.elevatorSub.elevatorUpManual();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return RobotMap.topLimitSwitch.get();
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevatorSub.stopManual();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
