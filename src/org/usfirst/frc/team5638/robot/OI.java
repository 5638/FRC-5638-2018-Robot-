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
import org.usfirst.frc.team5638.robot.commands.elevatorDownCom;
import org.usfirst.frc.team5638.robot.commands.elevatorUpCom;
import org.usfirst.frc.team5638.robot.commands.forwardDriveCom;
import org.usfirst.frc.team5638.robot.commands.reverseDriveCom;
import org.usfirst.frc.team5638.robot.commands.shiftDown;
import org.usfirst.frc.team5638.robot.commands.dumperReset;
import org.usfirst.frc.team5638.robot.commands.dumperDump;
import org.usfirst.frc.team5638.robot.commands.armDownCom;
import org.usfirst.frc.team5638.robot.commands.armUpCom;
import org.usfirst.frc.team5638.robot.commands.winchCom;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public XboxController xbox1;
	public XboxController xbox2;
	
	//DRIVE
	public JoystickButton shiftUp;
	public JoystickButton shiftDown;
	public JoystickButton forwardDrive;
	public JoystickButton reverseDrive;
	//DRIVE
	
	//ELEVATOR
	public JoystickButton eleUP;
	public JoystickButton eleDO;
	//ELEVATOR
	
	//DUMPER
	public JoystickButton Dumpdown;
	public JoystickButton Dumpup;
	//DUMPER
	
	//CLIMB
	public JoystickButton Carmup;
	public JoystickButton Carmdown;
	public JoystickButton Winchout;
	public JoystickButton Winchin;
	//CLIMB
	
	public OI() {
		xbox1 = new XboxController(0);
		xbox2 = new XboxController(1);
		
		//DRIVE
		shiftUp = new JoystickButton(xbox1, 1);
		shiftUp.toggleWhenPressed(new shiftUp());
		shiftDown = new JoystickButton(xbox1, 1);
		shiftUp.toggleWhenPressed(new shiftDown());
		forwardDrive = new JoystickButton(xbox1, 2);
		forwardDrive.toggleWhenPressed(new forwardDriveCom());
		reverseDrive = new JoystickButton(xbox1, 2);
		forwardDrive.toggleWhenPressed(new reverseDriveCom());
		//DRIVE
		
		//ELEVATOR
		eleUP = new JoystickButton(xbox2, 3);
		eleUP.whileHeld(new elevatorUpCom());
		eleDO = new JoystickButton(xbox2, 1);
		eleDO.whileHeld(new elevatorDownCom());
		//ELEVATOR
		
		//DUMPER
		Dumpdown = new JoystickButton(xbox2, 2);
		Dumpdown.whenPressed(new dumperReset());
		Dumpup = new JoystickButton(xbox2, 4);
		Dumpup.whenPressed(new dumperDump());
		//DUMPER
		
		//CLIMB
		Carmup = new JoystickButton(xbox2, 6);
		Carmup.whileHeld(new armUpCom());
		Carmdown = new JoystickButton(xbox2, 6);
		Carmdown.whileHeld(new armDownCom());
		Winchout = new JoystickButton(xbox2, 7);
		Winchout.whileHeld(new winchCom());
		Winchin = new JoystickButton(xbox2, 8);
		Winchin.whileHeld(new winchCom());
		//CLIMB
	}
}
