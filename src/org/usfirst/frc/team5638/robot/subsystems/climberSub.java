package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.climberCom;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class climberSub extends Subsystem {

    // Put methods for controlling this subsystem
	private final WPI_VictorSPX climber = RobotMap.climber;
	private final WPI_TalonSRX winch = RobotMap.winch;
	private final WPI_VictorSPX winch2 = RobotMap.winch2;
	
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
    	winch2.set(0.5);
    }
    public void winchIn() {
    	winch.set(-1);
    	winch2.set(-1);
    }
    public void winchStop() {
    	winch.set(0);
    	winch2.set(0);
    }
}

