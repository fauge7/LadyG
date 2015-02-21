package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	Talon t1;
	Talon t2;
	Talon t3;
	Talon t4;
	RobotDrive drive;
	public DriveTrain() {
		// TODO Auto-generated constructor stub
		super();
		t1 = new Talon(RobotMap.Talon_Drive_1);
		t2 = new Talon(RobotMap.Talon_Drive_3);
		t3 = new Talon(RobotMap.Talon_Drive_2);
		t4 = new Talon(RobotMap.Talon_Drive_4);
		drive = new RobotDrive(t1,t3);
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
		drive.setInvertedMotor(MotorType.kRearLeft, true);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new ArcadeDrive());
	}
	public void arcadeDrive(){
		drive.arcadeDrive(-Robot.oi.stick.getY(), -Robot.oi.stick.getTwist());
	}
}
