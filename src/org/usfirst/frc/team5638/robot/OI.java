/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5638.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team5638.robot.commands.shiftUp;
import org.usfirst.frc.team5638.robot.commands.shiftDown;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public XboxController xbox1;
	public XboxController xbox2;
	
	public JoystickButton shiftUp;
	public JoystickButton shiftDown;
	
	public OI() {
		xbox1 = new XboxController(0);
		xbox2 = new XboxController(1);
		
		shiftUp = new JoystickButton(xbox1, 1);
		shiftUp.toggleWhenPressed(new shiftUp());
		shiftDown = new JoystickButton(xbox1, 1);
		shiftUp.toggleWhenPressed(new shiftDown());
	}
}
