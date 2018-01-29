/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.driveCom;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class driveSub extends Subsystem {
	
	private final DifferentialDrive driveTrain = RobotMap.driveTrain;

	public void initDefaultCommand() {
		setDefaultCommand(new driveCom());
	}
	
	public void drive(XboxController xbox) {
		driveTrain.arcadeDrive((xbox.getRawAxis(2) + -xbox.getRawAxis(3)), -xbox.getRawAxis(0));
	}
	
	public void stop() {
		driveTrain.arcadeDrive(0, 0);
	}
}
