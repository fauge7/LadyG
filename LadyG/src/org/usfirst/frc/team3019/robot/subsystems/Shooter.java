package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	DoubleSolenoid soli;
	boolean tensioned;
	public Shooter() {
	// TODO Auto-generated constructor stub
	super();
	soli = new DoubleSolenoid(RobotMap.Shooter_1,RobotMap.Shooter_2);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void Tension(){
		soli.set(DoubleSolenoid.Value.kForward);
		tensioned = true;
	}
	public void unTension(){
		soli.set(DoubleSolenoid.Value.kReverse);
		tensioned = false;
	}
	public void doNothing(){
		soli.set(DoubleSolenoid.Value.kOff);
	}
}
