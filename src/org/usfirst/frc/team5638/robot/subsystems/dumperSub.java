package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.dumperCom;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class dumperSub extends Subsystem {

    // Put methods for controlling this subsystem
	private final WPI_TalonSRX dumper = (RobotMap.dumper); 
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new dumperCom());
    }
    public void dumperDump(){
    	double targetPostitionRotations = .5 * 4096; //.5 rotations * 4096 units/rev in either direction
    	dumper.set(ControlMode.Position, targetPostitionRotations);
    }
    public void dumperReset() {
    	double targetPostitionRotations = -.5 * 4096; //-.5 rotations * 4096 units/rev in either direction
    	dumper.set(ControlMode.Position, targetPostitionRotations);
    }
    public void dumperStop() {
    	dumper.set(0);
    }
}

