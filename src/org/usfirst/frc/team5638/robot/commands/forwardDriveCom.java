/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5638.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5638.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class forwardDriveCom extends Command {
	public forwardDriveCom() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveSub);
	}

	// Called just before this Command runs the first time
	
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	
	protected void execute() {
		Robot.driveSub.forwardDrive(Robot.m_oi.xbox1);
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
