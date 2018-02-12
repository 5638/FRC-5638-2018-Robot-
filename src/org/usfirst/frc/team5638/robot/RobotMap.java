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
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Timer.Interface;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//DRIVE TRAIN
	public static WPI_TalonSRX leftMaster; 		//2
	public static WPI_VictorSPX leftSlave; 		//3
	public static WPI_TalonSRX rightMaster;		//4
	public static WPI_VictorSPX rightSlave;		//5
	public static DoubleSolenoid shiftSol; 	
	public static DifferentialDrive driveTrain;
	//DRIVE TRAIN
	//ELEVATOR
	public static WPI_TalonSRX elevator;		//6
	public static DigitalInput topLimitSwitch;
	public static DigitalInput bottomLimitSwitch;
	//ELEVATOR
	//INTAKE
	public static DoubleSolenoid SQUEEEEEEEEZE;
	public static WPI_TalonSRX intake1;			//9
	public static WPI_VictorSPX intake2;		//10
	//INTAKE
	//DUMPER
	public static WPI_TalonSRX dumper;			//7
	//DUMPER
	//CLIMBER
	public static WPI_VictorSPX climber;		//8
	public static WPI_TalonSRX winch;			//11
	public static WPI_VictorSPX winch2;			//12
	//CLIMBER
	public static void init() {
		//DRIVE TRAIN
		leftMaster = new WPI_TalonSRX(2);
		leftSlave = new WPI_VictorSPX(3);
		rightMaster = new WPI_TalonSRX(4);
		rightSlave = new WPI_VictorSPX(5);
		
		//leftMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		leftSlave.set(ControlMode.Follower, 2);
		
		//rightMaster.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		rightSlave.set(ControlMode.Follower, 4);
		
		SpeedControllerGroup leftGearbox = new SpeedControllerGroup(leftMaster, leftSlave);
		SpeedControllerGroup rightGearbox = new SpeedControllerGroup(rightMaster, rightSlave);
		
		driveTrain = new DifferentialDrive(leftGearbox, rightGearbox);
		
		shiftSol = new DoubleSolenoid(0, 0, 1);
		
		//SmartDashboard.putNumber("Left", leftMaster.getSelectedSensorPosition(0)/4096);
		//SmartDashboard.putNumber("Right", rightMaster.getSelectedSensorPosition(0)/4096);
		//DRIVE TRAIN

		//ELEVATOR
		elevator = new WPI_TalonSRX(6);
		/*
		elevator.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		elevator.setSensorPhase(true);
		elevator.configNominalOutputForward(0, 10);
		elevator.configNominalOutputReverse(0, 10);
		elevator.configPeakOutputForward(.5, 10);
		elevator.configPeakOutputReverse(-.5, 10);
		elevator.configAllowableClosedloopError(0, 0, 10);
		
		elevator.config_kF(0, 0.0, 10);
		elevator.config_kP(0, 0.1, 10);
		elevator.config_kI(0, 0.0, 10);
		elevator.config_kD(0, 0.0, 10);
		
		int absolutePosition = elevator.getSensorCollection().getPulseWidthPosition();
		elevator.setSelectedSensorPosition(absolutePosition, 0, 10);
		
		topLimitSwitch = new DigitalInput(1);
		bottomLimitSwitch = new DigitalInput(2);
		*/
		SmartDashboard.putNumber("Elevator", elevator.getSelectedSensorPosition(0));
		//ELEVATOR
		
		//INTAKE
		SQUEEEEEEEEZE = new DoubleSolenoid(1, 0, 1);
		intake1 = new WPI_TalonSRX(9);
		intake2 = new WPI_VictorSPX(10);
		
		intake2.set(ControlMode.Follower, 9);
		//INTAKE

		//DUMPER
		dumper = new WPI_TalonSRX(7);
		/*
		dumper.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		dumper.setSensorPhase(true);
		dumper.configNominalOutputForward(0, 10);
		dumper.configNominalOutputReverse(0, 10);
		dumper.configPeakOutputForward(.5, 10);
		dumper.configPeakOutputReverse(-.5, 10);
		dumper.configAllowableClosedloopError(0, 0, 10);
		
		dumper.config_kF(0, 0.0, 10);
		dumper.config_kP(0, 0.1, 10);
		dumper.config_kI(0, 0.0, 10);
		dumper.config_kD(0, 0.0, 10);
		
		int absolutePositionDumper = dumper.getSensorCollection().getPulseWidthPosition();
		elevator.setSelectedSensorPosition(absolutePositionDumper, 0, 10);
		*/
		//DUMPER
		
		//CLIMBER
		climber = new WPI_VictorSPX(8);
		winch = new WPI_TalonSRX(11);
		winch2 = new WPI_VictorSPX(12);
		
		//winch2.set(ControlMode.Follower, 11);
		//CLIMBER
		
		
	}
}
