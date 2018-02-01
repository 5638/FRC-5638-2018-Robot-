package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;
import org.usfirst.frc.team5638.robot.commands.dumperCom;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class dumperSub extends Subsystem {

    // Put methods for controlling this subsystem
	private final SpeedController dumper = (RobotMap.dumper); 
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new dumperCom());
    }
    public void dumperDump(){
    	dumper.set(0.5);
    }
    public void dumperReset() {
    	dumper.set(-0.5);
    }
    public void dumperStop() {
    	dumper.set(0);
    }
}

