/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.forwardDriveCom;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class driveSub extends Subsystem {
	
	public JoystickButton forwardBut;
	
	
	private final DifferentialDrive driveTrain = RobotMap.driveTrain;

	public void initDefaultCommand() {
		setDefaultCommand(new forwardDriveCom());
	}
	
	public void forwardDrive(XboxController xbox1) {
		
		double steerStick;
		steerStick = xbox1.getRawAxis(0);
		
		if(steerStick < .1 || steerStick > -.1) {
			steerStick = 0;
		}
		
		driveTrain.arcadeDrive((xbox1.getRawAxis(2) + -xbox1.getRawAxis(3)), -steerStick);
	}
	
	public void reverseDrive(XboxController xbox1) {
			
		double steerStick;
		
		steerStick = xbox1.getRawAxis(0);
		
		if(steerStick < .1 || steerStick > -.1) {
			steerStick = 0;
		}
			
		driveTrain.arcadeDrive((-xbox1.getRawAxis(2) + xbox1.getRawAxis(3)), steerStick);
	}
	
	public void stop() {
		driveTrain.arcadeDrive(0, 0);
	}
}
