package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.shiftDown;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class shiftSub extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final DoubleSolenoid shiftSol = RobotMap.shiftSol;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new shiftDown());
    }
    
    public void shiftUp() {
    	shiftSol.set(DoubleSolenoid.Value.kForward);
    }
    
    public void shiftDown() {
    	shiftSol.set(DoubleSolenoid.Value.kReverse);
    }
}

