/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5638.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//DRIVE TRAIN
	public static WPI_TalonSRX leftMaster;
	public static WPI_TalonSRX leftSlave;
	public static WPI_TalonSRX rightMaster;
	public static WPI_TalonSRX rightSlave;
	public static DoubleSolenoid shiftSol;
	public static DifferentialDrive driveTrain;
	//DRIVE TRAIN
	//ELEVATOR
	public static WPI_TalonSRX elevator;
	//ELEVATOR
	//DUMPER
	public static WPI_TalonSRX dumper;
	//DUMPER
	public static void init() {
		//DRIVE TRAIN
		leftMaster = new WPI_TalonSRX(2);
		leftSlave = new WPI_TalonSRX(3);
		rightMaster = new WPI_TalonSRX(4);
		rightSlave = new WPI_TalonSRX(5);
		
		leftMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		leftSlave.set(ControlMode.Follower, 2);
		
		rightMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rightSlave.set(ControlMode.Follower, 4);
		
		SpeedControllerGroup leftGearbox = new SpeedControllerGroup(leftMaster, leftSlave);
		SpeedControllerGroup rightGearbox = new SpeedControllerGroup(rightMaster, rightSlave);
		
		driveTrain = new DifferentialDrive(leftGearbox, rightGearbox);
		
		shiftSol = new DoubleSolenoid(0, 0, 1);
		//DRIVE TRAIN

		//ELEVATOR
		elevator = new WPI_TalonSRX(6);
		
		elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		//ELEVATOR

		//DUMPER
		dumper = new WPI_TalonSRX(7);
		//DUMPER
	}
}
