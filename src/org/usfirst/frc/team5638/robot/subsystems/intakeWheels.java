package org.usfirst.frc.team5638.robot.subsystems;

import org.usfirst.frc.team5638.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class intakeWheels extends Subsystem {

	private final WPI_TalonSRX intakeWheel1 = RobotMap.intake1;
	private final WPI_TalonSRX intakeWheel2 = RobotMap.intake2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
    
    public void speed(double speed) {
    	intakeWheel1.set(speed);
    	intakeWheel2.set(-speed);
    }
}