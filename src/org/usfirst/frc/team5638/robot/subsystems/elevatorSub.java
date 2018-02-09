package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.elevatorUpCom;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class elevatorSub extends Subsystem {
	
	private final WPI_TalonSRX elevator = RobotMap.elevator;

	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new elevatorUpCom());
    }
    
    public void elevatorUp() {
    	double targetPostitionRotations = 10 * 4096; //10 rotations * 4096 units/rev in either direction
    	elevator.set(ControlMode.Position, targetPostitionRotations);
    }
    
    public void elevatorUpManual() {
    	elevator.set(.25);
    }
    
    public void elevatorDownManual() {
    	elevator.set(-.25);
    }
    
    public void elevatorDown() {
    	double targetPositionRotations = -10 * 4096; //-10 rotations * 4096 units/rev in either direction
    	elevator.set(ControlMode.Position, targetPositionRotations);
    }
    
    public void stop() {
    	double targetPositionRotations = 0 * 4096; //0 rotations * 4096 units/rev in either direction
    	elevator.set(ControlMode.Position, targetPositionRotations);
    }
    
    public void stopManual() {
    	elevator.set(0);
    }
}

