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
	private final SpeedController winch =(RobotMap.winch);
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new climberCom());
    }
    public void armrUp() {
    	climber.set(0.5);
    }
    public void armDown() {
    	climber.set(-0.5);
    }
    public void armStop() {
    	climber.set(0);
    }
    public void winchOut() {
    	winch.set(0.5);
    }
    public void winchIn() {
    	winch.set(-0.5);
    }
    public void winchStop() {
    	winch.set(0);
    }
}

