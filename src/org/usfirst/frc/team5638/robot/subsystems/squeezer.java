package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.intakeClose;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class squeezer extends Subsystem {
	
	private final DoubleSolenoid SQUEEEEEEEEZE = RobotMap.SQUEEEEEEEEZE;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new intakeClose());
    }
    
    public void open() {
    	SQUEEEEEEEEZE.set(DoubleSolenoid.Value.kForward);
    }
    
    public void close() {
    	SQUEEEEEEEEZE.set(DoubleSolenoid.Value.kReverse);
    }
}

