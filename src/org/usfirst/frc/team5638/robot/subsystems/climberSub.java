package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.climberCom;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class climberSub extends Subsystem {

    // Put methods for controlling this subsystem
	private final SpeedController climber = (RobotMap.climber);
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new climberCom());
    }
}

